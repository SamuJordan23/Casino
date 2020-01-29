import java.util.ArrayList;
import java.util.List;

public class MazzoBriscola {

	private List<CartaBriscola> carte;
	
	public MazzoBriscola() {
		carte=new ArrayList<>();
		
		
		
		carte.add(new CartaBriscola("Asso di Bastoni", 1));
		carte.add(new CartaBriscola("Due di Bastoni", 2));
		carte.add(new CartaBriscola("Tre di Bastoni", 3));
		carte.add(new CartaBriscola("Quattro di Bastoni", 4));
		carte.add(new CartaBriscola("Cinque di Bastoni", 5));
		carte.add(new CartaBriscola("Sei di Bastoni", 6));
		carte.add(new CartaBriscola("Sette di Bastoni", 7));
		carte.add(new CartaBriscola("Fante di Bastoni", 0.5));
		carte.add(new CartaBriscola("Cavallo di Bastoni", 0.5));
		carte.add(new CartaBriscola("Re di Bastoni", 0.5));
		
		carte.add(new CartaBriscola("Asso di Spade", 1));
		carte.add(new CartaBriscola("Due di Spade", 2));
		carte.add(new CartaBriscola("Tre di Spade", 3));
		carte.add(new CartaBriscola("Quattro di Spade", 4));
		carte.add(new CartaBriscola("Cinque di Spade", 5));
		carte.add(new CartaBriscola("Sei di Spade", 6));
		carte.add(new CartaBriscola("Sette di Spade", 7));
		carte.add(new CartaBriscola("Fante di Spade", 0.5));
		carte.add(new CartaBriscola("Cavallo di Spade", 0.5));
		carte.add(new CartaBriscola("Re di Spade", 0.5));

		carte.add(new CartaBriscola("Asso di Denari", 1));
		carte.add(new CartaBriscola("Due di Denari", 2));
		carte.add(new CartaBriscola("Tre di Denari", 3));
		carte.add(new CartaBriscola("Quattro di Denari", 4));
		carte.add(new CartaBriscola("Cinque di Denari", 5));
		carte.add(new CartaBriscola("Sei di Denari", 6));
		carte.add(new CartaBriscola("Sette di Denari", 7));
		carte.add(new CartaBriscola("Fante di Denari", 0.5));
		carte.add(new CartaBriscola("Cavallo di Denari", 0.5));
		carte.add(new CartaBriscola("Re di Denari", 0));
	
		carte.add(new CartaBriscola("Asso di Coppe", 1));
		carte.add(new CartaBriscola("Due di Coppe", 2));
		carte.add(new CartaBriscola("Tre di Coppe", 3));
		carte.add(new CartaBriscola("Quattro di Coppe", 4));
		carte.add(new CartaBriscola("Cinque di Coppe", 5));
		carte.add(new CartaBriscola("Sei di Coppe", 6));
		carte.add(new CartaBriscola("Sette di Coppe", 7));
		carte.add(new CartaBriscola("Fante di Coppe", 0.5));
		carte.add(new CartaBriscola("Cavallo di Coppe", 0.5));
		carte.add(new CartaBriscola("Re di Coppe", 0.5));
	
	
	}

	public String cartaCasuale(int n) {
		return carte.get(n).getNome();
	}
	public double valoreCarta(int n) {
		return carte.get(n).getValore();
	}
	
}
