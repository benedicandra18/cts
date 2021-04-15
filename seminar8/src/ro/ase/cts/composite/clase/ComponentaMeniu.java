package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
	
	void adaugareNod(ComponentaMeniu comp);
	void stergereNod(ComponentaMeniu comp);
	void afiseazaInformatii();
	ComponentaMeniu getComponenta(int index) throws Exception;

}
