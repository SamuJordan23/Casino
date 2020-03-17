import java.util.*;

public class SetteMezzo {

	public static void play() {
		MazzoBriscola m = new MazzoBriscola();
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("- SetteMezzo -");
		do {
			int banco = banco();
			if(banco == 7.5) {
				System.out.println("Il banco ha vinto facendo SetteMezzo\n");
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
			int n = r.nextInt(40); //Posizione casuale nel mazzo
			System.out.println("Le tue carte\n " + m.cartaCasuale(n)); //Stampa la carta che è uscita casualmente
			punteggio += m.valoreCarta(n); //Somma il valore della carta casuale al punteggio totale
			if(m.valoreCarta(n)==0) {
				System.out.println("Hai trovato la matta, quanto vuoi che valga?, puo' valere 0,5 1 2 3 4 5 6 e 7 \n");
				int scelta1 = in.nextInt();
				punteggio += scelta1;
				in.nextLine();
			}
			if(punteggio > 7.5) {
				System.out.println("Hai sballato con un punteggio di "+punteggio);
				break;
			}
			n = r.nextInt(40);
			System.out.println(" " + m.cartaCasuale(n));
				punteggio += m.valoreCarta(n);
				if(m.valoreCarta(n)==0) {
					System.out.println("Hai trovato la matta, quanto vuoi che valga?, puo' valere 0,5 1 2 3 4 5 6 e 7 \n");
					int scelta1 = in.nextInt();
					punteggio += scelta1;
					in.nextLine();
				}
			if(punteggio == 7.5) { //Controlla se hai fatto SetteMezzo
				System.out.println("Hai fatto SetteMezzo!");
			} else {
				System.out.println("Il tuo punteggio è " + punteggio);
				System.out.print("Vuoi un altra carta? (s/n): ");
				char scelta = in.nextLine().charAt(0); //Scelta (carta/fine)
				switch(scelta) {
					case 's':
					case 'S': {
						do {
							n = r.nextInt(40);
							System.out.println(m.cartaCasuale(n));
								punteggio += m.valoreCarta(n);
								if(m.valoreCarta(n)==0) {
									System.out.println("Hai trovato la matta, quanto vuoi che valga?, puo' valere 0,5 1 2 3 4 5 6 e 7 \n");
									int scelta1 = in.nextInt();
									punteggio += scelta1;
									in.nextLine();
								}
							if(punteggio >= 7.5)
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
				
				if(punteggio == 7.5)
					System.out.println("Hai vinto facendo SetteMezzo!");
				else if(punteggio > 7.5)
					System.out.println("Hai sballato con un punteggio di " + punteggio + "\n");
				else if(banco > 7.5)
					System.out.println("Il banco ha sballato con " + banco + ", hai vinto con un punteggio di " + punteggio + "\n");
				else if(punteggio > banco)
					System.out.println("Hai vinto con un punteggio di " + punteggio + " contro il banco che ha fatto " + banco + "\n");
				else if(punteggio == banco)
					System.out.println("Hai pareggiato con un punteggio di " + punteggio + "\n");
				else
					System.out.println("Hai perso con un punteggio di " + punteggio + " contro il banco che ha fatto " + banco + "\n");
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
		MazzoBriscola m = new MazzoBriscola();
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		int punteggio = 0;
		int n = r.nextInt(40);
		System.out.println("Le carte del banco\n " + m.cartaCasuale(n) + "\n Carta coperta\n");
		punteggio += m.valoreCarta(n);
		if(m.valoreCarta(n)==0) {
			System.out.println("Hai trovato la matta, quanto vuoi che valga?, puo' valere 0,5 1 2 3 4 5 6 e 7 \n");
			int scelta1 = in.nextInt();
			punteggio += scelta1;
			in.nextLine();
		}
		n = r.nextInt(40);
			punteggio += m.valoreCarta(n);
		
		while(punteggio < 5) {
			n = r.nextInt(40);
				punteggio += m.valoreCarta(n);if(m.valoreCarta(n)==0) {
					System.out.println("Hai trovato la matta, quanto vuoi che valga?, puo' valere 0,5 1 2 3 4 5 6 e 7 \n");
					int scelta1 = in.nextInt();
					punteggio += scelta1;
					in.nextLine();
				}
		}
		
		return punteggio;
	}
