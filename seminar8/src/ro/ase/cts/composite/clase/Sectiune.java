package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu{
	
	private String numeSectiune;
	private List<ComponentaMeniu> componente;
	
	
	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		this.componente = new ArrayList<ComponentaMeniu>();
	}

	
	@Override
	public void adaugareNod(ComponentaMeniu comp) {
		componente.add(comp);
		
	}

	@Override
	public void stergereNod(ComponentaMeniu comp) {
		componente.remove(comp);
		
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Sectiunea "+numeSectiune);
		for(ComponentaMeniu c:componente) {
			c.afiseazaInformatii();
		}
		
	}

	@Override
	public ComponentaMeniu getComponenta(int index) throws Exception {
		if(index>=0 && index<componente.size()) {
			return componente.get(index);
		}
		else {
			throw new Exception("Index-ul nu exista");
		}
	}

}
