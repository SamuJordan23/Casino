import java.io.*;
import java.util.Scanner;

public class Autenticazione {
	private String nome;
	private String cognome;
	private String mail;
	private String password;
	
	private static int id = 1;
	
	public Autenticazione(String nome, String cognome, String mail, String password) {
		this.nome = nome;
		this.cognome = cognome;
		this.mail = mail;
		this.password = password;
	}
	public Autenticazione() {
		nome = "";
		cognome = "";
		mail = "";
		password = "";
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

	public void login(String mail, String password) {
		if(mail == this.mail && password == this.password)
			System.out.println("Loggato correttamente");
		else
			System.out.println("Mail o password errati");
	}
	
	public void addUtente() throws IOException {
		String nome;
		String cognome;
		String mail;
		String password;
		int codiceCartaDiCredito;
		int cvvCartaDiCredito;

		Scanner s = new Scanner(System.in);
		BufferedWriter out = new BufferedWriter( new FileWriter("utenti.txt", true) );

		System.out.print("Inserisci il nome: ");
		nome = s.nextLine();
		System.out.print("Inserisci il cognome: ");
		cognome = s.nextLine();
		System.out.print("Inserisci la mail: ");
		mail = s.nextLine();
		System.out.print("Inserisci la password: ");
		password = s.nextLine();
		System.out.print("Inserisci il codice della carta di credito: ");
		codiceCartaDiCredito = s.nextInt();
		System.out.print("Inserisci il cvv della carta di credito: ");
		cvvCartaDiCredito = s.nextInt();
		
		s.nextLine();
		
		try{
			out.write(id + ";" + nome + ";" + cognome + ";" + mail + ";" + password + ";" + codiceCartaDiCredito + ";" + cvvCartaDiCredito + ";1");
			out.newLine();
			id++;
		}catch (Exception e){
			System.out.println("Error while writing to file: " + e.getMessage());
		}
		
		out.close();
	}
	
	public void addAmministratore() throws IOException {
		String nome;
		String cognome;
		String mail;
		String password;
		
		Scanner s = new Scanner(System.in);
		BufferedWriter out = new BufferedWriter( new FileWriter("amministratori.txt", true) );

		System.out.print("Inserisci il nome: ");
		nome = s.nextLine();
		System.out.print("Inserisci il cognome: ");
		cognome = s.nextLine();
		System.out.print("Inserisci la mail: ");
		mail = s.nextLine();
		System.out.print("Inserisci la password: ");
		password = s.nextLine();
		
		try{
			out.write(id + ";" + nome + ";" + cognome + ";" + mail + ";" + password + ";2");
			out.newLine();
			id++;
		} catch (Exception e) {
			System.out.println("Error while writing to file: " + e.getMessage());
		}
		
		out.close();
	}

}
