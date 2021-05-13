package ro.ase.cts.observer.clase;

public class Client implements Observer {

	private String nume;

	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteNotificare(String mesaj) {
		System.out.println(nume+", ai primit o notificare: "+mesaj);
		
	}

}
