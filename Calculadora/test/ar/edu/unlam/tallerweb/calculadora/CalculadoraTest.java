package ar.edu.unlam.tallerweb.calculadora;

//import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	@Test(expected = RuntimeException.class)
	public void quePuedaDividirEnterosPositivos() throws CalculadoraException{
		Calculadora c = new Calculadora();
		
		
		//Assert.assertEquals("Que 10 div 10 sea 1", 1.0, 
		c.getResultado(10.0, 0.0)git;
	}

}
