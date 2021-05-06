package ro.ase.cts.chain_of_responsability.program;

import ro.ase.cts.chain_of_responsability.clase.Cont;
import ro.ase.cts.chain_of_responsability.clase.ContCredit;
import ro.ase.cts.chain_of_responsability.clase.ContCurent;
import ro.ase.cts.chain_of_responsability.clase.ContEconomii;
import ro.ase.cts.chain_of_responsability.clase.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		Cont contCurent=new ContCurent("Andra",100);
		Cont contEconomii= new ContEconomii("Andra",200);
		Cont contCredit= new ContCredit("Andra",300);
		Cont contInd= new ContIndisponibil("Andra");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contInd);
		
		contCurent.realizarePlata(90);
		contCurent.realizarePlata(150);
		contCurent.realizarePlata(200);
		

	}

}
