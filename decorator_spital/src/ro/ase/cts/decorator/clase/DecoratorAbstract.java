package ro.ase.cts.decorator.clase;

public class DecoratorAbstract implements RezultatAbstract{
	
	private RezultatAbstract rez;

	public DecoratorAbstract(RezultatAbstract rez) {
		super();
		this.rez = rez;
	}

	@Override
	public void afisare() {
		rez.afisare();
		
	}

	public RezultatAbstract getRez() {
		return rez;
	}

	public void setRez(RezultatAbstract rez) {
		this.rez = rez;
	}
	
	
	
	

}
