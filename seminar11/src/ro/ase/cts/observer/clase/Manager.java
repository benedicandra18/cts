package ro.ase.cts.observer.clase;

public class Manager extends Subiect {
	public void anuntaMeciFotbal() {
		super.notificaClienti("A aparut un nou meci de fotbal!");
		
	}
	
	public void anuntaMeciVolei() {
		super.notificaClienti("A aparut un nou meci de volei!");
		
	}

}
