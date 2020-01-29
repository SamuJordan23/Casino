public class CartaBriscola {
	private String nome;
	private double valore;
	
	
	
//costrutore
	public CartaBriscola(String nome, double valore) {
		this.nome=nome;
		this.valore=valore;
	}

	
//to string	
@Override
	public String toString() {
		return nome;
	}

//metodi get e set
public String getNome() {
		return nome;
	}
public void setNome(String nome) {
		this.nome = nome;
	}
public double getValore() {
		return valore;
	}
public void setValore(double valore) {
		this.valore = valore;
	}	
}