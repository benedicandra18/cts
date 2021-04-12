package assignment;

public abstract class Cont {

	private int zileActiv;
	private TipCont tipCont;

	public Cont(int zileActiv, TipCont tipCont) throws Exception {
		this.zileActiv = zileActiv;
		this.tipCont = tipCont;
	}

	public int getZileActiv() {
		return zileActiv;
	}

	public void setZileActiv(int zileActiv) {
		this.zileActiv = zileActiv;
	}

	public TipCont getTipCont() {
		return this.tipCont;
	}

	public void setTipCont(TipCont tipCont) {
		this.tipCont = tipCont;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cont [zileActiv=");
		builder.append(zileActiv);
		builder.append(", tipCont=");
		builder.append(tipCont);
		builder.append("]");
		return builder.toString();
	}

	public void print() {
		System.out.println("This is an account");
	}

}