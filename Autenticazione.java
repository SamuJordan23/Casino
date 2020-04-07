import java.io.*;
import java.util.Scanner;

public class Autenticazione {
	
	private int currentId;
	
	private static int id = 1;
	
	public Autenticazione() {
		currentId = 0;
	}
	
	public int getCurrentId() {
		return currentId;
	}

	public void setCurrentId(int currentId) {
		this.currentId = currentId;
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
		BufferedWriter out = new BufferedWriter( new FileWriter("utenti.txt", true) );

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
	
	public void login() throws IOException {
		Scanner s = new Scanner(System.in);
		BufferedReader in = new BufferedReader( new FileReader("utenti.txt") );
		
		String mail;
		String password;
		String tmp = "";
		
		System.out.print("Inserisci la mail: ");
		mail = s.nextLine();
		
		try {
			while(true) {
				tmp = in.readLine();
				if( tmp.split(";")[3].equals(mail) )
					break;
			}
		} catch(Exception e) {
			System.out.println("Mail non esistente");
			in.close();
			return;
		}
		
		
		while(true) {
			System.out.print("Inserisci la password (0 per uscire): ");
			password = s.nextLine();
			
			if(password.equals("0")) {
				in.close();
				return;
			}
			
			if( tmp.split(";")[4].equals(password) ) {
				currentId = Integer.valueOf(tmp.split(";")[0]);
				break;
			}
			else
				System.out.println("Password errata");
		}
			
		System.out.println("Loggato correttamente");
		in.close();
	}
}