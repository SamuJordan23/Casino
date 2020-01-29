import java.util.ArrayList;
import java.util.List;

public class Amministratori extends Amministratore {
	private List <Amministratore> amministratori;
	
	public Amministratori() {
		amministratori= new ArrayList<>();
	}
	public void addAmministratore(String nome,String cognome,String mail,String password) {
		amministratori.add(new Amministratore(nome,cognome,mail,password));
	}
	public void removeAmministratore(int i) {
		amministratori.remove(i);
	}

}
