import java.util.ArrayList;
import java.util.List;

public class Utenti {
	private List <Utente> utenti;
	
	public Utenti() {
		utenti=new ArrayList<>();
	}
	public void addUtente(String nome,String cognome,String mail,String password) {
		utenti.add(new Utente(nome,cognome,mail,password));
	}
	public void removeUtente(int i) {
		utenti.remove(i);
	}
}