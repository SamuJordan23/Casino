import java.util.*;

public class MazzoPoker {

	private List<CartaPoker> carte;
	
	public MazzoPoker() {
		carte=new ArrayList<>();
		
		carte.add(new CartaPoker("Asso di Cuori", 11));
		carte.add(new CartaPoker("Due di Cuori", 2));
		carte.add(new CartaPoker("Tre di Cuori", 3));
		carte.add(new CartaPoker("Quattro di Cuori", 4));
		carte.add(new CartaPoker("Cinque di Cuori", 5));
		carte.add(new CartaPoker("Sei di Cuori", 6));
		carte.add(new CartaPoker("Sette di Cuori", 7));
		carte.add(new CartaPoker("Otto di Cuori", 8));
		carte.add(new CartaPoker("Nove di Cuori", 9));
		carte.add(new CartaPoker("Dieci di Cuori", 10));
		carte.add(new CartaPoker("Fante di Cuori", 10));
		carte.add(new CartaPoker("Donna di Cuori", 10));
		carte.add(new CartaPoker("Re di Cuori", 10));
		
		carte.add(new CartaPoker("Asso di Picche", 11));
		carte.add(new CartaPoker("Due di Picche", 2));
		carte.add(new CartaPoker("Tre di Picche", 3));
		carte.add(new CartaPoker("Quattro di Picche", 4));
		carte.add(new CartaPoker("Cinque di Picche", 5));
		carte.add(new CartaPoker("Sei di Picche", 6));
		carte.add(new CartaPoker("Sette di Picche", 7));
		carte.add(new CartaPoker("Otto di Picche", 8));
		carte.add(new CartaPoker("Nove di Picche", 9));
		carte.add(new CartaPoker("Dieci di Picche", 10));
		carte.add(new CartaPoker("Fante di Picche", 10));
		carte.add(new CartaPoker("Donna di Picche", 10));
		carte.add(new CartaPoker("Re di Picche", 10));

		carte.add(new CartaPoker("Asso di Fiori", 11));
		carte.add(new CartaPoker("Due di Fiori", 2));
		carte.add(new CartaPoker("Tre di Fiori", 3));
		carte.add(new CartaPoker("Quattro di Fiori", 4));
		carte.add(new CartaPoker("Cinque di Fiori", 5));
		carte.add(new CartaPoker("Sei di Fiori", 6));
		carte.add(new CartaPoker("Sette di Fiori", 7));
		carte.add(new CartaPoker("Otto di Fiori", 8));
		carte.add(new CartaPoker("Nove di Fiori", 9));
		carte.add(new CartaPoker("Dieci di Fiori", 10));
		carte.add(new CartaPoker("Fante di Fiori", 10));
		carte.add(new CartaPoker("Donna di Fiori", 10));
		carte.add(new CartaPoker("Re di Fiori", 10));

		carte.add(new CartaPoker("Asso di Quadri", 11));
		carte.add(new CartaPoker("Due di Quadri", 2));
		carte.add(new CartaPoker("Tre di Quadri", 3));
		carte.add(new CartaPoker("Quattro di Quadri", 4));
		carte.add(new CartaPoker("Cinque di Quadri", 5));
		carte.add(new CartaPoker("Sei di Quadri", 6));
		carte.add(new CartaPoker("Sette di Quadri", 7));
		carte.add(new CartaPoker("Otto di Quadri", 8));
		carte.add(new CartaPoker("Nove di Quadri", 9));
		carte.add(new CartaPoker("Dieci di Quadri", 10));
		carte.add(new CartaPoker("Fante di Quadri", 10));
		carte.add(new CartaPoker("Donna di Quadri", 10));
		carte.add(new CartaPoker("Re di Quadri", 10));
	
	}

	public String cartaCasuale(int n) {
		return carte.get(n).getNome();
	}
	public int valoreCarta(int n) {
		return carte.get(n).getValore();
	}
	
}
