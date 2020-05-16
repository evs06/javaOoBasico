package com.testAutomationCoach.dEncapsulacion;

public class Triangulo {
	
	//propiedades o campos
	private int base;
	private int altura;
	
	Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//metodos o comportamiento
	public int sacarArea() {
		int area= (this.base*this.altura)/2;
		return area;
	}

	public int sacarPerimetro() {
		int perimetro= this.base*3;
	    return perimetro;	
	}

	public int getBase() {
		return base;//DUDA
	}

	public void setBase(int base) {
		this.base = base;//DUDA
	}

	public int getAltura() {
		return altura;//DUDA
	}

	public void setAltura(int altura) {
		this.altura = altura;//DUDA
	}
	
	public String toString() {
		return "Base es " + this.base + " Altura es "+ this.altura;
	}

}
