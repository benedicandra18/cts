package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentDummy;
import dubluri.StudentStub;
import teste.categorii.TesteGetPromovabilitate;

public class TestGrupaWithStub {

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitate() {
		IStudent student = new StudentStub();
		Grupa grupa= new Grupa(1076);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}

}
