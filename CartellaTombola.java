import java.util.*;

public class CartellaTombola {
	public HashSet statoOriginale = new HashSet();
	public HashSet statoCorrente = new HashSet(); 
	
	public CartellaTombola() {
		System.out.println("Creazione cartella: ");
		for (int i = 1; i <= GestioneTombola.NUMCELLE; i++) {
			boolean creatoNuovoNumero = false;
			do {
				int x = GestioneTombola.generatore.nextInt(GestioneTombola.MAXNUM)+1;
				creatoNuovoNumero = statoOriginale.add(new Integer(x));
				if (creatoNuovoNumero) System.out.println("  + "+x);
			} while (!creatoNuovoNumero);
		}
		statoCorrente.addAll(statoOriginale);
	}
	
	public boolean checkNumber(int x) {
		boolean presente = statoCorrente.remove(new Integer(x));
		return presente;
	} 

	public boolean isFinished() {
		if (statoCorrente.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printOriginale() {
		Iterator iter = statoOriginale.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}  

	public void printCorrente() {
		Iterator iter = statoCorrente.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
} 
