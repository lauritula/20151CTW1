package ar.edu.unlam.tallerweb.clase3;

public class Disco {

//ATRIBUTOS
	
 double radioInterior;
 double radioExterior;
 
//CONSTRUCTOR
	public Disco(double radioInterior, double radioExterior) {
		
	this.radioInterior = radioInterior;
	this.radioExterior = radioExterior;
}



 public double getRadioInterior() {
		return radioInterior;
	}


	public void setRadioInterior(double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(double radioExterior) {
		this.radioExterior = radioExterior;
	}


//METODOS
	
	private double calcularPerimetro(double radio){
		return  2*Math.PI*radio;
	}
	
	public double calcularPerimetroInterior(){
		 return calcularPerimetro(this.radioInterior);
		 
	}
	
	public double calcularPerimetroExterior(){
		 return calcularPerimetro(this.radioExterior);		 
	 }
	

	 public double calcuarArea(){
		 
		 return this.areaExterna()-this.areaInterna();	 
	 }
	 
	 private double areaInterna() {
		// TODO Auto-generated method stub
		return 	Math.PI*Math.pow(this.radioInterior, 2);
	}



	private double areaExterna() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.radioExterior, 2);
	}
	
}
