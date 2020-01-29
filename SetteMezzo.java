import java.util.Random;
import java.util.Scanner;

public class SetteMezzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mazzo m = new Mazzo();
		Scanner in=new Scanner(System.in); //crea l'oggetto per l'inserimento dei dati da tastiera
		Random r = new Random();
		
		System.out.println("- Sette e Mezzo -");
		do {
			double punteggio = 0;
			int n = r.nextInt(40);
			System.out.println("La tua carta iniziale e' \n " + m.cartaCasuale(n));
			punteggio += m.valoreCarta(n); //punteggio = punteggio + ...
			
			if(m.valoreCarta(n)==0) {
				System.out.println("Hai trovato la matta, quanto vuoi che valga?, puo' valere 0,5 1 2 3 4 5 6 e 7 \n");
				int scelta1 = in.nextInt();
				punteggio += scelta1;
				in.nextLine();
			}
			n = r.nextInt(40);
				System.out.println("Il tuo punteggio è " + punteggio);
				System.out.print("Vuoi un altra carta? (si/no): ");
				char scelta = in.nextLine().charAt(0); //charAt converte la stringa in carattere
				switch(scelta) {
					case 's': {
						do {
							n = r.nextInt(40);
							System.out.println(m.cartaCasuale(n));
							if(m.valoreCarta(n)==0) {
								System.out.println("Hai trovato la matta, quanto vuoi che valga?, puo' valere 0,5 1 2 3 4 5 6 e 7 \n");
								int scelta1 = in.nextInt();
								punteggio += scelta1;
								in.nextLine();
							}
							punteggio += m.valoreCarta(n);
							System.out.println("Il tuo punteggio ora è " + punteggio);
							if(punteggio > 7.5) {
								System.out.print("Hai sballato con un punteggio di " + punteggio + "\n");
								break;
							}
							System.out.print("Vuoi un altra carta? (si/no): ");
							scelta = in.nextLine().charAt(0);
						} while(scelta == 's');
					}
						break;
					case 'n':
						break;
					default: scelta = 'n';
				}
					System.out.println("Hai concluso con un punteggio di " + punteggio + "\n");
				

			System.out.print("Vuoi giocare ancora? (si/no): ");
			char giocaAncora = in.nextLine().charAt(0);
			if(giocaAncora != 's')
				break;
		} while(true);
		
		in.close();
	}

}
