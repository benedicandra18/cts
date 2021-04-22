package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Program {

	public static void main(String[] args) {
		Card card=new Card(500);
		Client client =new Client("Titi", card);
		
		client.platesteNota(50);
		
		Cash cash = new Cash();
		
		client.setModalitatePlata(cash);
		client.platesteNota(40);
		
		client.setModalitatePlata(card);
		client.platesteNota(30);
	}

}
