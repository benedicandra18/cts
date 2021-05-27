package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

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
		public void testPromovabilitatePerf() {
			grupa.getPromovabilitate();
		}

}
