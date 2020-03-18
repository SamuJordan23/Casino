import java.util.ArrayList;

public class Partita {
	final private Giocatore[] giocatori;
	final private Tabellone tab;
	private Vincita ultimaVincita;

	final private static float montepremi = Gestore.NUM_GIOCATORI * Gestore.PREZZO_CARTELLA;
	
	public Partita(final Giocatore[] g) {
		giocatori = g;
		tab = new Tabellone();
		ultimaVincita = null;
		Gestione.info("Creata nuova partita");
	}
	
	public static float calcolaVincita(Vincita v) {
		// suddivido il montepremi in base alla vincita
		switch (v) {
			case Ambo:
				return montepremi/15*1;
			case Terna:
				return montepremi/15*2;
			case Quaterna:
				return montepremi/15*3;
			case Cinquina:
				return montepremi/15*4;
			case Tombola:
				return montepremi/15*5;
			default:
				return 0;
		}
	}
	
	public void avviaCiclo() {
		while(true) { // ciclo infinito, termina solo quando finisce la partita
			final int n = tab.estraiNumero();
			Gestione.info("Estratto numero: "+n);

			// controllo se il numero è presente in qualche cartella
			final ArrayList<Giocatore> vincitori = new ArrayList<>();
			for (Giocatore g: giocatori) {
				final Cartella c = g.getCartella();
				if (c.numeroEstratto(n)) {
					Gestione.info("La cartella di "+g.getNome()+" contiene il numero!");
					final Vincita v = c.vincitaMax();
					if (v == Vincita.next(ultimaVincita)) {
						vincitori.add(g);
						Gestione.info("La cartella di "+g.getNome()+" vince: "+v.name());
						c.stampa();
					}
				}
			}
			
			// suddivide la vincita tra gli eventuali vincitori
			if (vincitori.size() > 0) {
				ultimaVincita = Vincita.next(ultimaVincita);
				float importo = calcolaVincita(ultimaVincita) / vincitori.size();
				Gestione.info("Divido la vincita ("+ultimaVincita.name()+") tra "+vincitori.size()+" giocatori: ciascuno "+importo);
				for (Giocatore g: vincitori) {
					g.setVincita(ultimaVincita);
					g.aggiungiSommaVinta(importo);
				}
			}
			
			if (ultimaVincita == Vincita.Tombola) {
				Gestione.info("Tombola uscita, partita finita!");
				return;
			}
		}
	}
}
