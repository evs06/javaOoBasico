package com.testAutomationCoach.dEncapsulacion;

import libs.Input;

public class EjemploDelTriangulo {

	public static void main(String[] args) {
		Triangulo t = new Triangulo(5,3);

		int base = t.getBase();
		int altura = t.getAltura();

		System.out.println(base+" "+altura);

		int nuevaBase=10;
		t.setBase(nuevaBase);
		int nuevaAltura=10;
		t.setAltura(nuevaAltura);

		System.out.println("El area es " + t.sacarArea());
		System.out.println("El perimetro es " + t.sacarPerimetro());
		System.out.println(t);//DUDA
		
		Input.print(Double.MAX_VALUE + "\n");//DUDA
		Input.print(Float.MAX_VALUE);//DUDA
	}
}
