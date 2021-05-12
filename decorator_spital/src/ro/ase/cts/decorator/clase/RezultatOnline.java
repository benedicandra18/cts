package ro.ase.cts.decorator.clase;

public class RezultatOnline extends DecoratorAbstract {

	public RezultatOnline(RezultatAbstract rez) {
		super(rez);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void afisare() {
		super.afisare();
		System.out.println("Rezultat online: "+((Rezultat)(super.getRez())).getTitluAnaliza()
				+" - "+((Rezultat)(super.getRez())).getValoareAnaliza());
		
	}
	
	
	

}
