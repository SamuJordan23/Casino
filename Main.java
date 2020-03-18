
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gestore g = new Gestore();
		
		// aggiunge NUM_GIOCATORI giocatori al gestore g. La partita
		// inizia automaticamente non appena ci sono abbastanza giocatori
		for (int i=0; i<Gestore.NUM_GIOCATORI; i++) {
			g.iscrivi(new Giocatore("Giocatore "+i));
		}
	}

}
