import java.util.ArrayList;

public class Giocatore {
	private final String nome;
	private Cartella cart;
	private ArrayList<Vincita> vincite;
	private float sommaVinta;

	public Giocatore (String nome_) {
		nome = nome_;
		vincite = new ArrayList<>();
		sommaVinta = 0;
	}
	
	public void nuovaCartella() { 
		cart = new Cartella();
		Gestione.info("Nuova cartella per "+getNome());
		cart.stampa();
	}
	public Cartella getCartella() {
		return cart;
	}
	
	public String getNome() {
		return nome;
	}

	
	public void aggiungiSommaVinta(float importo) {
		if (importo > 0)
			sommaVinta += importo;
	}
	public float getSommaVinta() {
		return sommaVinta;
	}
	
	public boolean getVincita(Vincita v) {
		return vincite.contains(v);
	}
	public void setVincita(Vincita v) {
		vincite.add(v);
	}
	
	public void stampa() {
		Gestione.info("Giocatore: "+getNome());
		
		String vi = "Vincite: ";
		for (Vincita v: Vincita.values()) {
			if (getVincita(v))
				vi += v.name()+" ";
		}
		Gestione.info(vi);
		Gestione.info("Somma vinta: "+getSommaVinta());
		Gestione.info();

	}

}
