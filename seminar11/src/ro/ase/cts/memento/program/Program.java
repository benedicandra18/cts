package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeciuriJucate;
import ro.ase.cts.memento.clase.MeciJucat;

public class Program {

	public static void main(String[] args) {
		MeciJucat m1=new MeciJucat(200,"Real Madrid","Sepsi", 300,200,30);
		ManagerMeciuriJucate man1= new ManagerMeciuriJucate();
		man1.adaugaMemento(m1.salvareInformatii());
		
		m1.setNrSpectatori(400);
		m1.setNumeEchipaGazda("Barcelona");
		m1.setNumeEchipaOaspeti("PSJ");
		man1.adaugaMemento(m1.salvareInformatii());
		
		System.out.println(m1.toString());
		m1.revenire(man1.getMemento(0));
		System.out.println(m1.toString());
	
	}

}
