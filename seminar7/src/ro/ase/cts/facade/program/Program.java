package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BazaDeDateHuligani;
import ro.ase.cts.facade.clase.Bilet;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Program {

	public static void main(String[] args) {
		Persoana p1=new Persoana("Mara","2990203145678");
		Bilet b1=new Bilet("Mara","2A");
		
		if(p1.getNume().equals(b1.getNume())) {
			if(!Politie.esteUrmarit(p1)) {
				if(!BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
					System.out.println("Poftiti!");
				}
			}
		}
		
		Persoana p2=new Persoana("Marius","1990203145673");
		Bilet b2=new Bilet("Marius","2B");
		
		if(Facade.sePermiteAccesulPeStadion(p2, b2)) {
			System.out.println("Poftiti!");
		}
		else {
			System.out.println("Nu intrati!");
		}
		
		
	}

}
