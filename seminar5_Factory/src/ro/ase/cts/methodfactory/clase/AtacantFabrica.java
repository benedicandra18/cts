package ro.ase.cts.methodfactory.clase;

public class AtacantFabrica implements JucatorFabrica {

	@Override
	public Jucator createJucator(String nume) {
		// TODO Auto-generated method stub
		return new Atacant(nume);
	}

}
