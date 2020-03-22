
public class Giocatore {
	public String name;
	public CartellaTombola cartella;
	
	Giocatore(String name){
		this.name=name;
		cartella=new CartellaTombola();
	}

	public void checkNumber(int x){
		boolean hasNumber=cartella.checkNumber(x);
		if (hasNumber) {
			System.out.println(name+" ha il numero "+x);
			boolean isFinished=cartella.isFinished();
			if (isFinished) {
				System.out.println(name+" ha vinto! ");
				System.out.println("La cartella vincente é:");
				cartella.printOriginale();
				System.exit(1);
			} 
		}
	}
} 
