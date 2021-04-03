package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterBilet;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Program {
	
	public static void rezervaSiVindeBilet(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	
	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}

	public static void main(String[] args) {
		Bilet bo=new Bilet(30);
		BiletOnline biletOnline=new AdapterBilet(40);
		
		rezervaSiVindeBiletLaCasa(bo);
		rezervaSiVindeBilet(biletOnline);
		

	}

}
