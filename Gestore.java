import java.util.ArrayDeque;

public class Gestore {
	public final static int NUM_GIOCATORI= 1;			
	public final static float PREZZO_CARTELLA= 10.00f;     
	public final static int NUM_IN_UNA_CARTELLA= 15;
	public final static int RIGHE_IN_UNA_CARTELLA= 3;

	private ArrayDeque<Giocatore> coda;
	
	public Gestore() {
		coda = new ArrayDeque<>();
	}
	
	public void iscrivi(Giocatore g) {
		// controllo se il giocatore non sia già in coda
		if (!coda.contains(g)) {
			Gestione.info("Aggiunto giocatore alla coda: "+g.getNome());
			coda.addLast(g);
		}

		// la partita si avvia automaticamente se viene raggiunto il numero minimo
		if (coda.size() >= NUM_GIOCATORI) {
			Gestione.info("È stato raggiunta la soglia di "+NUM_GIOCATORI+" giocatori in coda. Avvio la partita");
			iniziaPartita();
		}
	}
	
	private void iniziaPartita() {
		// crea la lista dei giocatori
		final Giocatore[] giocatori = new Giocatore[NUM_GIOCATORI];
		for (int i=0; i<NUM_GIOCATORI; i++) {
			Giocatore g = coda.removeFirst();
			g.nuovaCartella();
			giocatori[i] = g;
		}
		
		// crea e avvia la partita
		final Partita p = new Partita(giocatori);
		p.avviaCiclo();
		
		// partita finita, riepilogo
		Gestione.info("RIEPILOGO");
		for (Giocatore g: giocatori) {
			g.stampa();
		}
	}
	
}
