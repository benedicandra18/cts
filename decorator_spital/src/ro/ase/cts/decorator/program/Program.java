package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.Rezultat;
import ro.ase.cts.decorator.clase.RezultatOnline;

public class Program {

	public static void main(String[] args) {
		Rezultat rez1= new Rezultat("lipide",10);
		DecoratorAbstract dec=new RezultatOnline(rez1);
		rez1.afisare();
		dec.afisare();

	}

}
