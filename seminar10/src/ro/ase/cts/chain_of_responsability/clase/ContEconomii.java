package ro.ase.cts.chain_of_responsability.clase;

public class ContEconomii extends Cont {

	public ContEconomii(String detinator, float sold) {
		super(detinator, sold);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void realizarePlata(float suma) {
		if(super.getSold() > suma) {
			System.out.println("S-a realizat plata de " + suma + " RON din cont economii");
			super.setSold(super.getSold() - suma);
		} else {
			super.getSuccesor().realizarePlata(suma);
		}
		
	}


}
