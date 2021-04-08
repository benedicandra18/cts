package ro.ase.cts.facade.clase;

public class Facade {
	
	public static boolean sePermiteAccesulPeStadion(Persoana persoana, Bilet bilet) {
		if(persoana.getNume().equals(bilet.getNume())) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BazaDeDateHuligani.esteInListaDeHuligani(persoana)) {
					return true;
				}
			}
		}
		return false;
	}

}
