package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorHandicap;
import ro.ase.cts.template.clase.SpectatorUzual;
import ro.ase.cts.template.clase.TemplateIntrareStadion;

public class Program {

	public static void main(String[] args) {
		TemplateIntrareStadion sp1 = new SpectatorUzual("vali");
		sp1.intrareStation();
		
		TemplateIntrareStadion sp2 = new SpectatorHandicap("dani");
		sp2.intrareStation();
		
	}

}
