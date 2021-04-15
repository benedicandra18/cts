package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare {
	private OperatorRezervare operator;
	private int numarMinimPersoane;
	
	
	public Proxy(OperatorRezervare operator, int numarMinimPersoane) {
		super();
		this.operator = operator;
		this.numarMinimPersoane = numarMinimPersoane;
	}


	@Override
	public void rezerva(int nrPers) {
		if(nrPers>numarMinimPersoane) {
			operator.rezerva(nrPers);
			
		}
		else {
			System.out.println("Nu se poate realiza rezervarea pentru "+nrPers);
		}
		
	}

}
