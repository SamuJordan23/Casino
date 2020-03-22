import java.io.IOException;
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

		File out = new File("utenti.txt", 'W');
		File in = new File("utenti.txt", 'R');
		Scanner s = new Scanner(System.in);
		
		String file = "";
		try {
			while(true) {
				file += in.fromFile();
			}
		} catch ( FileException exception ) {
			System.out.println(exception.getMatter());
		}

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
		
		try {
			out.toFile(file + id + ";" + nome + ";" + cognome + ";" + mail + ";" + password + ";" + codiceCartaDiCredito + ";" + cvvCartaDiCredito + ";1");
			id++;
		} catch ( FileException exception ) {
			System.out.println(exception.getMatter());
		}
		out.closeFile();
	}
	
	public void addAmministratore() throws IOException {
		String nome;
		String cognome;
		String mail;
		String password;
		
		File out = new File("amministratori.txt", 'W');
		File in = new File("amministratori.txt", 'R');
		Scanner s = new Scanner(System.in);
		
		String file = "";
		try {
			while(true) {
				file += in.fromFile();
			}
		} catch ( FileException exception ) {
		}

		System.out.print("Inserisci il nome: ");
		nome = s.nextLine();
		System.out.print("Inserisci il cognome: ");
		cognome = s.nextLine();
		System.out.print("Inserisci la mail: ");
		mail = s.nextLine();
		System.out.print("Inserisci la password: ");
		password = s.nextLine();
		
		try {
			out.toFile(file + id + ";" + nome + ";" + cognome + ";" + mail + ";" + password + ";2");
			id++;
		} catch ( FileException exception ) {
		}
		out.closeFile();
	}

}
