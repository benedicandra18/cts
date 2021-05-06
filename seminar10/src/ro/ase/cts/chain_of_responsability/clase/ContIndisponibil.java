package ro.ase.cts.chain_of_responsability.clase;

public class ContIndisponibil extends Cont{

	public ContIndisponibil(String detinator) {
		super(detinator, 0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void realizarePlata(float suma) {
		System.out.println("Nu s-a putut realiza plata");
	}

}


