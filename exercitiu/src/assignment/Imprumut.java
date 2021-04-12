package assignment;

public class Imprumut extends Cont implements IImprumut{
	private double valoareImprumut;
	private double rataImprumut;

	public Imprumut(int zileActiv, TipCont tipCont, double valoareImprumut, double rataImprumut) throws Exception {
		super(zileActiv, tipCont);
		if (valoareImprumut < 0)
			throw new Exception();
		else {
			this.valoareImprumut = valoareImprumut;
		}
		this.rataImprumut = rataImprumut;
	}

	public double getValoareImprumut() {
		return this.valoareImprumut;
	}

	public double getRataImprumut() {
		return this.rataImprumut;
	}

	public void setValoareImprumut(double valoare) throws Exception {
		if (valoare < 0) {
			throw new Exception();
		} else {
			this.valoareImprumut = valoare;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Imprumut [valoareImprumut=");
		builder.append(valoareImprumut);
		builder.append(", rataImprumut=");
		builder.append(rataImprumut);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double getRataLunara() {
		return this.valoareImprumut*this.rataImprumut;
	}

}
