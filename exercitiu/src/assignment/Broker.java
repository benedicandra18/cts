package assignment;

import java.util.List;

public class Broker {
	private List<Imprumut> imprumuturi;
	private double comision;

	public double calculeazaComisionTotal() {
		double comisionTotal = 0.0;
		int temp = 365;

		for (Imprumut imprumut : imprumuturi) {
			if (imprumut.getTipCont() == TipCont.PREMIUM || imprumut.getTipCont() == TipCont.SUPER_PREMIUM) {

				comisionTotal += comision * (imprumut.getValoareImprumut()
						* Math.pow(imprumut.getRataImprumut(), (imprumut.getZileActiv() / temp))
						- imprumut.getValoareImprumut());

			}

		}
		return comisionTotal;

	}

}
