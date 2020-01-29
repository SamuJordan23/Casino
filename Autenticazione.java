
public class Autenticazione {
	private String nome;
	private String cognome;
	private String mail;
	private String password;
	
	public Autenticazione(String nome,String cognome,String mail,String password) {
		this.nome=nome;
		this.cognome=cognome;
		this.mail=mail;
		this.password=password;
	}
	public Autenticazione() {
		nome="";
		cognome="";
		mail="";
		password="";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void autenticazione(String tipoPersona) {
		
	}
	public void login(String mail,String password) {
		
	}

}
