public class Triangulo {
	
	int base;
	int altura;

	Triangulo(int base, int altura) {	
		
		this.base=base;
		this.altura=altura;

	}
	
	public void areaTriangulo(){
		
		float area;
		area=(base*altura)/2;
		System.out.println("Area del triangulo: "+area);
		
	}
	
	public void perimetroTriangulo(){
		
		float perimetro;
		perimetro=base*3;
		System.out.println("Perimetro del triangulo: "+perimetro);
		
	}

}
