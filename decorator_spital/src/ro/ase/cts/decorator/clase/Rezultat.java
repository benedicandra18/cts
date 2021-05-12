package ro.ase.cts.decorator.clase;

public class Rezultat implements RezultatAbstract {
	private String titluAnaliza;
	private float valoareAnaliza;
	
	public Rezultat(String titluAnaliza, float valoareAnaliza) {
		super();
		this.titluAnaliza = titluAnaliza;
		this.valoareAnaliza = valoareAnaliza;
	}

	public String getTitluAnaliza() {
		return titluAnaliza;
	}

	public void setTitluAnaliza(String titluAnaliza) {
		this.titluAnaliza = titluAnaliza;
	}

	public float getValoareAnaliza() {
		return valoareAnaliza;
	}

	public void setValoareAnaliza(float valoareAnaliza) {
		this.valoareAnaliza = valoareAnaliza;
	}

	@Override
	public void afisare() {
		System.out.println("Rezultat la printare: "+this.titluAnaliza+" - "+this.valoareAnaliza);
		
	}

}
