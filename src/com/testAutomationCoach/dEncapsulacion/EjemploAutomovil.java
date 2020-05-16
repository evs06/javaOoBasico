package com.testAutomationCoach.dEncapsulacion;

public class EjemploAutomovil {

	public static void main(String[] args) {
		Automovil a1 = new Automovil();
		a1.acelerar();
		a1.frenar();
		a1.retroceder();
		double velocidad1 = a1.getVelocidad();
		System.out.println(velocidad1);

		System.out.println();

		Automovil a2 = new Automovil("Chrysler", 250.0, "Automatico", 5, 4);
		a2.acelerar();
		a2.frenar();
		a2.retroceder();
		double velocidad2 = a2.getVelocidad();
		System.out.println(velocidad2);
	}

}
