package ar.edu.tallerweb.cuenta;

public class CuentaBancaria {
//atributos
	float saldo;
//métodos
public float depositarDinero (float saldo, float deposito){
	float saldoNuevo;
	saldoNuevo=saldo+deposito;
	return saldoNuevo;
}
public float retirarDinero (float saldo, float retiro){
	float saldoNuevo;
	saldoNuevo=saldo-retiro;
	return saldoNuevo;
}
public CuentaBancaria (float saldo)

{ this.saldo= saldo;
	}

}


