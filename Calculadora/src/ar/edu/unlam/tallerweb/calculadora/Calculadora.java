
package ar.edu.unlam.tallerweb.calculadora;

public class Calculadora {

	public Double getResultado(Double dividendo, Double divisor){
		if(divisor==0){
		throw new RuntimeException("Error");
			}		
		else return dividendo/divisor;
		}
}
