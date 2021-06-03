package dubluri;

import java.util.List;

import clase.IStudent;

public class StudentFake implements IStudent {
	String valGetNume;
	float valGetMedie;
	int valGetNota;
	boolean valGetRestante;

	public void setValGetNume(String valGetNume) {
		this.valGetNume = valGetNume;
	}

	public void setValGetMedie(float valGetMedie) {
		this.valGetMedie = valGetMedie;
	}

	public void setValGetNota(int valGetNota) {
		this.valGetNota = valGetNota;
	}

	public void setValGetRestante(boolean valGetRestante) {
		this.valGetRestante = valGetRestante;
	}
	
	@Override
	public String getNume() {
		return valGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return valGetMedie;
	}

	@Override
	public int getNota(int index) {
		return valGetNota;
	}

	@Override
	public boolean areRestante() {
		return valGetRestante;
	}

}
