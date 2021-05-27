package teste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import clase.Grupa;
import clase.Student;

public class TestGrupa {
		
	//right bicep
	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1076);
		assertEquals(1076, grupa.getNrGrupa());
	}
	
	//boundary limita inferioara
	@Test
	public void testConstructorBoundaryInf() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	//boundary limita superioara
	@Test
	public void testConstructorBoundarySup() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstrctorError() {
		Grupa grupa = new Grupa(1200);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstrctorErrorInf() {
		Grupa grupa = new Grupa(900);
		
	}
	
	//performance
	@Test(timeout=500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1076);
	}
	
	//CORRECT
	
	//conformitate
	//ordering
	//range - sunt facute  deja
	//reference
	//existance
	
	@Test
	public void testConstrctorLista() {
		Grupa grupa= new Grupa(1076);
		assertNotNull(grupa.getStudenti());
	}
	
	//cardinality 0 1 n
	//t
	
	//Teste metode
	//RIGHT BICEP
	
	@Test
	public void testePromovabilitateRight() {
		Grupa grupa = new Grupa(1076);
		for(int i=0;i<7;i++) {
			Student student = new Student("Eugen");
			student.adaugaNota(4);
			student.adaugaNota(3);
			student.adaugaNota(4);
			
			grupa.adaugaStudent(student);
		}
		
		for(int i=0;i<5;i++) {
			Student student2 = new Student("Lucia");
			student2.adaugaNota(8);
			student2.adaugaNota(10);
			student2.adaugaNota(9);

			grupa.adaugaStudent(student2);	
		}
		
		assertEquals(0.41, grupa.getPromovabilitate(), 0.01);
	}
	
	//boundary
	
	@Test
	public void testPromovabilitateBoundaryInf() {
		Grupa grupa = new Grupa(1076);
		for(int i=0;i<7;i++) {
			Student student = new Student("Eugen");
			student.adaugaNota(6);
			student.adaugaNota(3);
			student.adaugaNota(4);
			
			grupa.adaugaStudent(student);
		}
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testPromovabilitateBoundarySup() {
		Grupa grupa = new Grupa(1076);
		for(int i=0;i<7;i++) {
			Student student = new Student("Eugen");
			student.adaugaNota(6);
			student.adaugaNota(8);
			student.adaugaNota(9);
			
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testPromovabilitateCross() {
		Grupa grupa = new Grupa(1076);
		grupa.getPromovabilitate();
	}
	
	

}
