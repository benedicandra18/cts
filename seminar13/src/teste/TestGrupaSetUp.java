package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.Student;
import teste.categorii.TesteGetPromovabilitate;

public class TestGrupaSetUp {

	Grupa grupa;
	
	@Before
	public void setUp() throws Exception{
		grupa= new Grupa(1076);
		for(int i=0;i<35;i++) {
			Student student = new Student("Eugen");
			student.adaugaNota(6);
			student.adaugaNota(8);
			student.adaugaNota(9);
			student.adaugaNota(6);
			student.adaugaNota(8);
			student.adaugaNota(9);
			student.adaugaNota(6);
			student.adaugaNota(8);
			
			grupa.adaugaStudent(student);
		}
		
	}

	//performance
		@Test(timeout=500)
		@Category(TesteGetPromovabilitate.class)
		public void testPromovabilitatePerf() {
			grupa.getPromovabilitate();
		}

}
