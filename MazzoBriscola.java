import java.util.ArrayList;
import java.util.List;

public class Mazzo {

	private List<Carta> carte;
	
	public Mazzo() {
		carte=new ArrayList<>();
		
		
		
		carte.add(new Carta("Asso di Bastoni", 1));
		carte.add(new Carta("Due di Bastoni", 2));
		carte.add(new Carta("Tre di Bastoni", 3));
		carte.add(new Carta("Quattro di Bastoni", 4));
		carte.add(new Carta("Cinque di Bastoni", 5));
		carte.add(new Carta("Sei di Bastoni", 6));
		carte.add(new Carta("Sette di Bastoni", 7));
		carte.add(new Carta("Fante di Bastoni", 0.5));
		carte.add(new Carta("Cavallo di Bastoni", 0.5));
		carte.add(new Carta("Re di Bastoni", 0.5));
		
		carte.add(new Carta("Asso di Spade", 1));
		carte.add(new Carta("Due di Spade", 2));
		carte.add(new Carta("Tre di Spade", 3));
		carte.add(new Carta("Quattro di Spade", 4));
		carte.add(new Carta("Cinque di Spade", 5));
		carte.add(new Carta("Sei di Spade", 6));
		carte.add(new Carta("Sette di Spade", 7));
		carte.add(new Carta("Fante di Spade", 0.5));
		carte.add(new Carta("Cavallo di Spade", 0.5));
		carte.add(new Carta("Re di Spade", 0.5));

		carte.add(new Carta("Asso di Denari", 1));
		carte.add(new Carta("Due di Denari", 2));
		carte.add(new Carta("Tre di Denari", 3));
		carte.add(new Carta("Quattro di Denari", 4));
		carte.add(new Carta("Cinque di Denari", 5));
		carte.add(new Carta("Sei di Denari", 6));
		carte.add(new Carta("Sette di Denari", 7));
		carte.add(new Carta("Fante di Denari", 0.5));
		carte.add(new Carta("Cavallo di Denari", 0.5));
		carte.add(new Carta("Re di Denari", 0));
	
		carte.add(new Carta("Asso di Coppe", 1));
		carte.add(new Carta("Due di Coppe", 2));
		carte.add(new Carta("Tre di Coppe", 3));
		carte.add(new Carta("Quattro di Coppe", 4));
		carte.add(new Carta("Cinque di Coppe", 5));
		carte.add(new Carta("Sei di Coppe", 6));
		carte.add(new Carta("Sette di Coppe", 7));
		carte.add(new Carta("Fante di Coppe", 0.5));
		carte.add(new Carta("Cavallo di Coppe", 0.5));
		carte.add(new Carta("Re di Coppe", 0.5));
	
	
	}

	public String cartaCasuale(int n) {
		return carte.get(n).getNome();
	}
	public double valoreCarta(int n) {
		return carte.get(n).getValore();
	}
	
}
