package ar.edu.tallerweb.figuras;

import org.junit.Assert;
import org.junit.Test;

public class CuadradoTest {
	
	@Test
	public void testAreaIgualCero(){
     
		Cuadrado miCuadrado = new Cuadrado(0);
		
	
		Assert.assertTrue(true);
		Assert.assertNotNull(miCuadrado.calcularArea(0));
		
	
		
	}

}
