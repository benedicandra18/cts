package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeciuriJucate {
	private List<Memento> istoric;
	
	
	
	public ManagerMeciuriJucate() {
		super();
		this.istoric = new ArrayList();
	}

	public void adaugaMemento(Memento memento) {
		istoric.add(memento);
	}
	
	public Memento getMemento(int poz) {
		if(poz<istoric.size()) {
			return istoric.get(poz);
		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}

}
