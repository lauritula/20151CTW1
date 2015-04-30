package ar.edu.unlam.tallerweb.clase3;



import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {

	@Test
	public void testPerimetroInterior(){
		
		Disco miDisco = new Disco(2,2);
		double actuals= miDisco.calcularPerimetroInterior();
		double expecteds=12.56;
		Assert.assertEquals(expecteds, actuals, 0.1);
		miDisco=null;		
	}	
	
	@Test
	public void testPerimetroExtero(){
		
		Disco miDisco2 = new Disco(2,2);
		double actuals=miDisco2.calcularPerimetroExterior();
		double expecteds=12.56;
		Assert.assertEquals(expecteds, actuals, 0.1);
		miDisco2=null;
		
	}
	
	 @Test
	 public void testArea(){
	 Disco miDisco3 = new Disco(2,2);
	 double actuals=miDisco3.calcuarArea();
	 double expecteds=0.0;
	 Assert.assertEquals(expecteds, actuals, 0.1);
	 
	 }
	
}
