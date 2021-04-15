package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements IOperatorRezervare{
	
	private String numeLocal;
	
	public OperatorRezervare(String numeLocal) {
		super();
		this.numeLocal = numeLocal;
	}

	public String getNumeLocal() {
		return numeLocal;
	}

	@Override
	public void rezerva(int nrPers) {
		System.out.println("S-a realizat rezervare pentru "+nrPers+" la localul"+numeLocal);
		
	}
	
	

}
