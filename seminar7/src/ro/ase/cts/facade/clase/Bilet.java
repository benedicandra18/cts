package ro.ase.cts.facade.clase;

public class Bilet {
	private String nume;
	private String loc;
	public Bilet(String nume, String loc) {
		super();
		this.nume = nume;
		this.loc = loc;
	}
	public String getNume() {
		return nume;
	}
	public String getLoc() {
		return loc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [nume=");
		builder.append(nume);
		builder.append(", loc=");
		builder.append(loc);
		builder.append("]");
		return builder.toString();
	}
	
	

}
