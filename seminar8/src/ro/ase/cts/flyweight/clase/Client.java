package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract{
	
	private String nume;
	private String nrTel;
	private String adresaEmail;
	
	
	
	public Client(String nume, String nrTel, String adresaEmail) {
		super();
		this.nume = nume;
		this.nrTel = nrTel;
		this.adresaEmail = adresaEmail;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", nrTel=");
		builder.append(nrTel);
		builder.append(", adresaEmail=");
		builder.append(adresaEmail);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public void afiseazaInformatii(Rezervare rezervare) {
		System.out.println(this.toString()+rezervare.toString());
		
	}

}
