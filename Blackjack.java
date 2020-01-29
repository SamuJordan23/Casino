import java.util.*;

public class Blackjack {

	public static void play() {
		Mazzo m = new Mazzo();
		Scanner in=new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("- Blackjack -");
		do {
			int punteggio = 0;
			int n = r.nextInt(51); //Posizione casuale nel mazzo
			System.out.println("Le tue carte\n " + m.cartaCasuale(n)); //Stampa la carta che è uscita casualmente
			punteggio += m.valoreCarta(n); //Somma il valore della carta casuale al punteggio totale
			n = r.nextInt(51);
			System.out.println(" " + m.cartaCasuale(n));
			if(m.valoreCarta(n) == 11 && punteggio >= 11) //Controlla quanto far valere l'asso
				punteggio += 1;
			else
				punteggio += m.valoreCarta(n);
			if(punteggio == 21) { //Controlla se hai fatto blackjack
				System.out.println("Hai fatto Blackjack!");
			} else {
				System.out.println("Il tuo punteggio è " + punteggio);
				System.out.print("Vuoi un altra carta? (s/n): ");
				char scelta = in.nextLine().charAt(0); //Scelta (carta/fine)
				switch(scelta) {
					case 's':
					case 'S': {
						do {
							n = r.nextInt(51);
							System.out.println(m.cartaCasuale(n));
							if(m.valoreCarta(n) == 11 && punteggio >= 11) //Controlla quanto far valere l'asso
								punteggio += 1;
							else
								punteggio += m.valoreCarta(n);
							if(punteggio >= 21)
								break;
							System.out.println("\nIl tuo punteggio ora è " + punteggio);
							System.out.print("Vuoi un altra carta? (s/n): ");
							scelta = in.nextLine().charAt(0);
						} while(scelta == 's');
					}
						break;
					case 'n':
					case 'N':
						break;
					default: break;
				}
				
				if(punteggio > 21)
					System.out.println("Hai sballato con un punteggio di " + punteggio + "\n");
				else
					System.out.println("Hai concluso con un punteggio di " + punteggio + "\n");
				
			}

			System.out.print("Vuoi giocare ancora? (s/n): ");
			char giocaAncora = in.nextLine().charAt(0);
			if(giocaAncora != 's' && giocaAncora != 'S') {
				System.out.println("Ciao, torna presto!");
				break;
			}
			else
				System.out.println();
			
		} while(true);
		
		in.close();
	}

}
