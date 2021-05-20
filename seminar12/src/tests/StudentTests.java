package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {
	

	@Test
	public void testConstructorCuParametru() {
		String nume="Dumitru";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		assertEquals("Student", student.getNume());
	}
	
	@Test
	public void testAreRestanta() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(3);
		assertTrue("Studentul care are restanta este marcat ca neavand restanta!",student.areRestante());
	}
	
	@Test
	public void testNuAreRestanta() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(9);
		assertFalse("Studentul care nu are restanta este marcat ca avand restanta!",student.areRestante());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		student.adaugaNota(9);
		assertEquals(1,student.getNote().size());
	}
	
	@Test
	public void testAdaugaNotaCorecta() {
		Student student = new Student();
		int nota=9;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}

}
