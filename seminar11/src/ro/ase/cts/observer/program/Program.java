package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.Manager;
import ro.ase.cts.observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Observer c1= new Client("andra");
		Observer c2= new Client("deni");
		
		manager.adaugaObserver(c1);
		manager.adaugaObserver(c2);
		
		manager.anuntaMeciFotbal();
		manager.stergeObserver(c2);
		manager.anuntaMeciVolei();

	}

}
