package ejercicio1;

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
}
