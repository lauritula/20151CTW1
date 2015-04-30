package ar.edu.tallerweb.figuras;

public class Cuadrado {
	
	float lado;
		


		public float calcularArea(float lado){
			float area;
			area= (float)Math.pow(2,lado);
			return area;
		}
		
		public float calcularPerimetro(float lado){
			float perimetro;
			perimetro=lado*4;
			return perimetro;
		}

		public Cuadrado(float lado) {
			this.lado = lado;
		}
		
		
}
