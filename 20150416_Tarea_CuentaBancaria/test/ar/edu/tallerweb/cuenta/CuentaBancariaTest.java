package ar.edu.tallerweb.cuenta;

import org.junit.Assert;
import org.junit.Test;


public class CuentaBancariaTest {
	@Test
	public void depositoValido() {
		CuentaBancaria miCuenta = new CuentaBancaria(1000);
		miCuenta.depositarDinero(miCuenta.saldo, 300);
		Assert.assertTrue(true);
		Assert.assertTrue(miCuenta.saldo == 1300);
	}

	
	
	

}
