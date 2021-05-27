package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

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
	//

}
