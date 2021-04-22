package ro.ase.cts.strategy.clase;

public class Card implements ModalitatePlata{
	
	private float sold;
	
	public Card(float sold) {
		super();
		this.sold = sold;
	}

	@Override
	public void achita(float suma) {
		if(suma<=sold) {
			System.out.println("S-a realizat plata prin card cu suma "+suma);
			sold-=suma;
		}
		else {
			System.out.println("Nu s-a realizat plata");
		}
	}

}
