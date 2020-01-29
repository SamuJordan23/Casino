public class Carta {
	
	private String nome;
	private int valore;

	public Carta(String nome, int valore) {
		this.nome=nome;
		this.valore=valore;
	}

	public String toString() {
		return nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValore() {
		return valore;
	}
	public void setValore(int valore) {
		this.valore = valore;
	}	
}
