
public class Amministratore extends Autenticazione {
	private double guadagniAzienda;
	
	public Amministratore(String nome,String cognome,String mail,String password) {
		super(nome,cognome,mail,password);
		guadagniAzienda=0.0;
	}
	public Amministratore() {
		super();
		guadagniAzienda=0.0;
	}
	public void visualizzaContoUtente(String mail) {
		
	}
	public void visualizzaListaPartite(String mail) {
		
	}
	public void visualizzaGuadagniAzienda() {
		
	}
}