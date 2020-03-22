import java.util.*;

public class BancoTombola {
	public Random generatore;
	public Set numeriUsciti;

	public BancoTombola() {
		generatore = GestioneTombola.generatore;
		numeriUsciti = new HashSet();
	}
	public int getNextNumber() {
		boolean isNew = false;
		int num = 0;
		do {
			num = generatore.nextInt(GestioneTombola.MAXNUM) + 1;
			isNew = numeriUsciti.add(new Integer(num));
			if (! isNew) {
			}	
		} while (!isNew);
		System.out.println("\n------>"+num );
		return num;
	}

 
	public void test() {
		while (numeriUsciti.size() < GestioneTombola.MAXNUM) {
			this.getNextNumber();
		}
		Iterator iter = numeriUsciti.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
} 