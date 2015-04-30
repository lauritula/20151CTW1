package ar.edu.unlam.tallerweb.tragamonedas;

public class Tragamoneda {

	//ATRIBUTOS
	
	private int tamborUno = ((int) Math.random() * 100); 
	private int tamborDos = ((int) Math.random() * 100);
	private int tamborTres = ((int) Math.random() * 100);
	
	private cara cantidad;

	public int getTamborUno() {
		return tamborUno;
	}

	public void setTamborUno(int tamborUno) {
		this.tamborUno = tamborUno;
	}

	public int getTamborDos() {
		return tamborDos;
	}

	public void setTamborDos(int tamborDos) {
		this.tamborDos = tamborDos;
	}

	public int getTamborTres() {
		return tamborTres;
	}

	public void setTamborTres(int tamborTres) {
		this.tamborTres = tamborTres;
	}

	//CONSTRUCTOR
	
	public Tragamoneda(int tamborUno, int tamborDos, int tamborTres) {
		this.tamborUno = tamborUno;
		this.tamborDos = tamborDos;
		this.tamborTres = tamborTres;
	}
	
	//METODOS
	
	public boolean entregaDePremios(){
		
		if(this.tamborUno==this.tamborDos && this.tamborDos==this.tamborTres && this.tamborUno==this.tamborTres){
			return true;			
		}
		return false;
	}
	
}
