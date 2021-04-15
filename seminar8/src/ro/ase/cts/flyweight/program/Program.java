package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaFlyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1=new Rezervare(1,4,2);
		Rezervare rezervare2=new Rezervare(2,4,3);
		Rezervare rezervare3=new Rezervare(3,4,4);
		
		FabricaFlyweight fabricaClienti= new FabricaFlyweight();
		Client client=(Client) fabricaClienti.getClient("0712345567");
		client.afiseazaInformatii(rezervare1);
		
		Client client1=(Client) fabricaClienti.getClient("07000001");
		client.afiseazaInformatii(rezervare2);
		
		fabricaClienti.getClient("07000000").afiseazaInformatii(rezervare3);
	}

}
