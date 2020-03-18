import java.util.Arrays;

public class Cartella {
	private int[] numeri; 
	final private boolean[] segnati; // true se il numero corrispondente è segnato
	
	public Cartella() {
		segnati = new boolean[15]; //default tutti false
		inizializzaCartella();
	}

	public Vincita vincitaMax() {
		// Registra quanti numeri estratti in ogni riga della cartella
		final int[] righe = new int[3];
		for (int i=0; i<15; i++) {
			if (segnati[i])
				righe[(int)(i/5)] ++;
		}

		// Controlla tombola
		if (righe[0] + righe[1] + righe[2] == 15) // tutti i numeri segnati
			return Vincita.Tombola;
		
		// Niente tombola, calcola la riga migliore (quella con più numeri segnati)
		final int v = Math.max(righe[0], Math.max(righe[1], righe[2]));
		switch(v) {
			case 2:   // due numeri estratti nel caso migliore
				return Vincita.Ambo;
			case 3:   // tre numeri estratti nel caso migliore
				return Vincita.Terna;
			case 4:   // quattro numeri estratti nel caso migliore
				return Vincita.Quaterna;
			case 5:   // cinque numeri estratti nel caso migliore
				return Vincita.Cinquina;
			default:  // zero o un numero estratto nel caso migliore
				return null;
		}
	}

	// Chiamata ogni volta che viene estratto un numero
	public boolean numeroEstratto(final int numero) {
		// cerca il numero tra quelli presenti nella cartella, e se presente lo segna estratto
		final int indice = Gestione.indexOf(numero, numeri, Gestore.NUM_IN_UNA_CARTELLA);
		if (indice >= 0) {
			segnati[indice] = true;
			return true;
		}
		return false;
	}
	
	// Posiziona i numeri nella cartella
	private void inizializzaCartella() {
		numeri = new int[15]; 
		// Riempio il vettore con 15 numeri casuali che rispettino le regole:
		// 1. no numeri ripetuti
		// 2. max 2 numeri con la stessa decina
		final int[] decine = new int[10]; 
		for (int i=0; i<15; i++) {
			// Genero un numero casuale tra 1 e 90
			final int n = Gestione.generaCasuale(1, 90);
			final int d = n==90? 8 : n/10; //il 90 va nella colonna degli 80

			// Se il numero casuale generato è già presente oppure se ci sono già due
			// numeri con la stessa decina, ripeto il calcolo dell'elemento i-esimo
			if (decine[d] >= 2 || Gestione.indexOf(n, numeri, i) >= 0) {
				i--;
				continue;
			} else {
				numeri[i] = n;
				decine[d]++;
			}
		}

		// Ordina il vettore finale
		Arrays.sort(numeri);

		// Permuta per ottenere le righe finali (un elemento ogni tre nel vettore ordinato)
		int tmp = numeri[1];
		numeri[1] = numeri[3];
		numeri[3] = numeri[9];
		numeri[9] = numeri[13];
		numeri[13] = numeri[11];
		numeri[11] = numeri[5];
		numeri[5] = numeri[2];
		numeri[2] = numeri[6];
		numeri[6] = numeri[4];
		numeri[4] = numeri[12];
		numeri[12] = numeri[8];
		numeri[8] = numeri[10];
	    numeri[10] = numeri[5];
		numeri[5] = tmp;
		
		// Scambia (in verticale) i numeri della stessa colonna se non sono in ordine tra loro
		for (int i=0; i<15; i++) {
			final int n = numeri[i];
			final int d = n/10;
			for (int j=i; j<15; j++) {
				final int n2 = numeri[j];
				final int d2 = n2/10;
				
				if (d == d2 && n>n2) { // d==d2: stessa colonna, n>n2 ordine invertito
					final int temp = numeri[i];
					numeri[i] = numeri[j];
					numeri[j] = temp;
				}
			}
		}
	}
	
	
	public void stampa() {
		final String spazio = "   ";
		for (int i=0; i<3; i++) {
			String output = "";
			int d = 0;
			for (int j=0; j<5; j++) {
				int index = i*5+j;
				int num = numeri[index];

				// spazi per i numeri mancanti (per incolonnare i numeri nella giusta decina)
				int x = (int)((double)num/10.0);
				if (num == 90) // il 90 va nella colonna degli 80
					x = 8;
				for (int n=1; n<x-d+(j==0?1:0); n++)
					output += spazio+"   ";
				d = x;

				// stampa numero
				output += String.format("%s%02d%c", spazio, num, (segnati[index]?'#':' '));
			}

			Gestione.info(output);
		}
	}

}
