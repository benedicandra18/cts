package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentFake;
import teste.categorii.TesteGetPromovabilitate;

public class TestGrupaWithFake {

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testPromovalibilitateRight() {
		Grupa grupa= new Grupa(1076);
		for(int i=0;i<8;i++) {
			StudentFake student = new StudentFake();
			student.setValGetRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++) {
			StudentFake student = new StudentFake();
			student.setValGetRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8,grupa.getPromovabilitate(),0.01);
		
	}

}
