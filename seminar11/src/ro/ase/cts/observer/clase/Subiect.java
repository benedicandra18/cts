package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
	private List <Observer> observeri;

	public Subiect() {
		super();
		this.observeri= new ArrayList<>();
	}
	
	public void adaugaObserver(Observer obs) {
		observeri.add(obs);
	}
	
	public void stergeObserver(Observer obs) {
		observeri.remove(obs);
	}
	
	public void notificaClienti(String mesaj) {
		for(Observer obs :observeri) {
			obs.primesteNotificare(mesaj);
		}
	}
	

}
