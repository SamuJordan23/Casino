import java.util.ArrayList;
import java.util.List;

public class Utente extends Autenticazione {
	private int codiceCartaDiCredito;
	private int cvvCartaDiCredito;
	private List <String> listaPartite;
	private double conto;
	private double guadagni;

	
	public Utente(String nome,String cognome,String mail,String password) {
		super(nome,cognome,mail,password);
		codiceCartaDiCredito=0;
		cvvCartaDiCredito=0;
		conto=0.0;
		guadagni=0.0;
		listaPartite=new ArrayList<>();
		
	}
	public Utente() {
		super();
		codiceCartaDiCredito=0;
		cvvCartaDiCredito=0;
		conto=0.0;
		guadagni=0.0;
		listaPartite=new ArrayList<>();
	}
	
	
	public int getCodiceCartaDiCredito() {
		return codiceCartaDiCredito;
	}
	public void setCodiceCartaDiCredito(int codiceCartaDiCredito) {
		this.codiceCartaDiCredito = codiceCartaDiCredito;
	}
	public int getCvvCartaDiCredito() {
		return cvvCartaDiCredito;
	}
	public void setCvvCartaDiCredito(int cvvCartaDiCredito) {
		this.cvvCartaDiCredito = cvvCartaDiCredito;
	}
	public List<String> getListaPartite() {
		return listaPartite;
	}
	public void setListaPartite(List <String> listaPartite) {
		this.listaPartite = listaPartite;
	}
	public double getConto() {
		return conto;
	}
	public void setConto(double conto) {
		this.conto = conto;
	}
	public double getGuadagni() {
		return guadagni;
	}
	public void setGuadagni(double guadagni) {
		this.guadagni = guadagni;
	}
	
	
	public void inserisciCarta(int codiceCartaDiCredito,int cvvCartaDiCredito) {
		this.codiceCartaDiCredito=codiceCartaDiCredito;
		this.cvvCartaDiCredito=cvvCartaDiCredito;
	}
	public void ricarica(double soldi) {
		conto+=soldi;
	}
	public void perdi(double soldi) {
		conto-=soldi;
	}

}