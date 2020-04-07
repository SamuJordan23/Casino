import java.io.IOException;
import java.util.*;

public class Blackjack {

	public static void play(Autenticazione a) throws IOException {
		MazzoPoker m = new MazzoPoker();
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("- Blackjack -");
		do {
			int banco = banco();
			if(banco == 21) {
				System.out.println("Il banco ha vinto facendo BlackJack\n");
				a.aggiornaLista("BlackJack;Perso");
				System.out.print("Vuoi giocare ancora? (s/n): ");
				char giocaAncora = in.nextLine().charAt(0);
				if(giocaAncora != 's' && giocaAncora != 'S') {
					System.out.println("Ciao, torna presto!");
					break;
				}
				else
					continue;
			}
			int punteggio = 0;
			int n = r.nextInt(51); //Posizione casuale nel mazzo
			System.out.println("Le tue carte\n " + m.cartaCasuale(n)); //Stampa la carta che � uscita casualmente
			punteggio += m.valoreCarta(n); //Somma il valore della carta casuale al punteggio totale
			n = r.nextInt(51);
			System.out.println(" " + m.cartaCasuale(n));
			if(m.valoreCarta(n) == 11 && punteggio >= 11) //Controlla quanto far valere l'asso
				punteggio += 1;
			else
				punteggio += m.valoreCarta(n);
			if(punteggio == 21) { //Controlla se hai fatto blackjack
				System.out.println("Hai fatto Blackjack!");
				a.aggiornaLista("BlackJack;Vinto");
			} else {
				System.out.println("Il tuo punteggio � " + punteggio);
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
							System.out.println("\nIl tuo punteggio ora � " + punteggio);
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
				
				if(punteggio == 21) {
					System.out.println("Hai vinto facendo BlackJack!");
					a.aggiornaLista("BlackJack;Vinto");
				} else if(punteggio > 21) {
					System.out.println("Hai sballato con un punteggio di " + punteggio + "\n");
					a.aggiornaLista("BlackJack;Perso");
				} else if(banco > 21) {
					System.out.println("Il banco ha sballato con " + banco + ", hai vinto con un punteggio di " + punteggio + "\n");
					a.aggiornaLista("BlackJack;Vinto");
				} else if(punteggio > banco) {
					System.out.println("Hai vinto con un punteggio di " + punteggio + " contro il banco che ha fatto " + banco + "\n");
					a.aggiornaLista("BlackJack;Vinto");
				} else if(punteggio == banco) {
					System.out.println("Hai pareggiato con un punteggio di " + punteggio + "\n");
					a.aggiornaLista("BlackJack;Pareggio");
				} else {
					System.out.println("Hai perso con un punteggio di " + punteggio + " contro il banco che ha fatto " + banco + "\n");
					a.aggiornaLista("BlackJack;Perso");
				}
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
	
	private static int banco() {
		MazzoPoker m = new MazzoPoker();
		Random r = new Random();
		
		int punteggio = 0;
		int n = r.nextInt(51);
		System.out.println("Le carte del banco\n " + m.cartaCasuale(n) + "\n Carta coperta\n");
		punteggio += m.valoreCarta(n);
		n = r.nextInt(51);
		if(m.valoreCarta(n) == 11 && punteggio >= 11)
			punteggio += 1;
		else
			punteggio += m.valoreCarta(n);
		
		while(punteggio < 17) {
			n = r.nextInt(51);
			if(m.valoreCarta(n) == 11 && punteggio >= 11)
				punteggio += 1;
			else
				punteggio += m.valoreCarta(n);
		}
		
		return punteggio;
	}

}
