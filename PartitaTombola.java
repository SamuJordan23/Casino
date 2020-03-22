
public class PartitaTombola {
	
	public PartitaTombola() {
		BancoTombola b1 = new BancoTombola();
		Giocatore p = new Giocatore("Pippo");
		while (true) {
			int x = b1.getNextNumber();
			System.out.println("Il numero estratto é " + x);
			p.checkNumber(x);
		}
	}
} 
