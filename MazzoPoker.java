import java.util.*;

public class Mazzo {

	private List<Carta> carte;
	
	public Mazzo() {
		carte=new ArrayList<>();
		
		carte.add(new Carta("Asso di Cuori", 11));
		carte.add(new Carta("Due di Cuori", 2));
		carte.add(new Carta("Tre di Cuori", 3));
		carte.add(new Carta("Quattro di Cuori", 4));
		carte.add(new Carta("Cinque di Cuori", 5));
		carte.add(new Carta("Sei di Cuori", 6));
		carte.add(new Carta("Sette di Cuori", 7));
		carte.add(new Carta("Otto di Cuori", 8));
		carte.add(new Carta("Nove di Cuori", 9));
		carte.add(new Carta("Dieci di Cuori", 10));
		carte.add(new Carta("Jack di Cuori", 10));
		carte.add(new Carta("Queen di Cuori", 10));
		carte.add(new Carta("King di Cuori", 10));
		
		carte.add(new Carta("Asso di Picche", 11));
		carte.add(new Carta("Due di Picche", 2));
		carte.add(new Carta("Tre di Picche", 3));
		carte.add(new Carta("Quattro di Picche", 4));
		carte.add(new Carta("Cinque di Picche", 5));
		carte.add(new Carta("Sei di Picche", 6));
		carte.add(new Carta("Sette di Picche", 7));
		carte.add(new Carta("Otto di Picche", 8));
		carte.add(new Carta("Nove di Picche", 9));
		carte.add(new Carta("Dieci di Picche", 10));
		carte.add(new Carta("Jack di Picche", 10));
		carte.add(new Carta("Queen di Picche", 10));
		carte.add(new Carta("King di Picche", 10));

		carte.add(new Carta("Asso di Fiori", 11));
		carte.add(new Carta("Due di Fiori", 2));
		carte.add(new Carta("Tre di Fiori", 3));
		carte.add(new Carta("Quattro di Fiori", 4));
		carte.add(new Carta("Cinque di Fiori", 5));
		carte.add(new Carta("Sei di Fiori", 6));
		carte.add(new Carta("Sette di Fiori", 7));
		carte.add(new Carta("Otto di Fiori", 8));
		carte.add(new Carta("Nove di Fiori", 9));
		carte.add(new Carta("Dieci di Fiori", 10));
		carte.add(new Carta("Jack di Fiori", 10));
		carte.add(new Carta("Queen di Fiori", 10));
		carte.add(new Carta("King di Fiori", 10));

		carte.add(new Carta("Asso di Quadri", 11));
		carte.add(new Carta("Due di Quadri", 2));
		carte.add(new Carta("Tre di Quadri", 3));
		carte.add(new Carta("Quattro di Quadri", 4));
		carte.add(new Carta("Cinque di Quadri", 5));
		carte.add(new Carta("Sei di Quadri", 6));
		carte.add(new Carta("Sette di Quadri", 7));
		carte.add(new Carta("Otto di Quadri", 8));
		carte.add(new Carta("Nove di Quadri", 9));
		carte.add(new Carta("Dieci di Quadri", 10));
		carte.add(new Carta("Jack di Quadri", 10));
		carte.add(new Carta("Queen di Quadri", 10));
		carte.add(new Carta("King di Quadri", 10));
	
	}

	public String cartaCasuale(int n) {
		return carte.get(n).getNome();
	}
	public int valoreCarta(int n) {
		return carte.get(n).getValore();
	}
	
}
