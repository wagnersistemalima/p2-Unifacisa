package entities.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Data;
import entities.Locadora;

public class LocadoraTeste {
	
	
	

	@Test
	public void testGetQuantidadeDeDias() {
		
		assertEquals(40, Locadora.getQuantidadeDeDias(new Data(5, 10), new Data(15, 11)));
		assertEquals(115, Locadora.getQuantidadeDeDias(new Data(10, 8), new Data(5, 12)));
		assertEquals(1, Locadora.getQuantidadeDeDias(new Data(5, 8), new Data(5, 8)));	
		
	}

}
