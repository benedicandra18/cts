package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorMesajLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorMesajSustinere;

public class Program {

	public static void main(String[] args) {
		Bilet bilet = new Bilet("FCSB","PSG","Andra");
		bilet.rezervaBilet();
		
		DecoratorMesajSustinere decorator=new DecoratorMesajSustinere(bilet);
		decorator.rezervaBilet();
		
		System.out.println("");
		
		DecoratorMesajLaMultiAni decorator2=new DecoratorMesajLaMultiAni(bilet);
		decorator2.rezervaBilet();
		
		System.out.println("");
		
		DecoratorAbstract decorator3=new DecoratorMesajLaMultiAni(decorator);
		decorator3.rezervaBilet();
	}

}
