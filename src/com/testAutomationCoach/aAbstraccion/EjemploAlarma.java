package com.testAutomationCoach.aAbstraccion;

public class EjemploAlarma {

    public static void main(String[] args) {
        Alarma alarma = new Alarma();

        alarma.marca = "Casio";
        alarma.horas = 8;
        alarma.minutos = 30;
        alarma.segundos = 00;
        alarma.pilas = "AA";

        alarma.programaralarma();
        alarma.encenderalarma();
        alarma.apagaralarma();
        alarma.activaralarma();
        alarma.desactivaralarma();

        libs.Input.print("Marca: " + alarma.marca + "\n");
        libs.Input.print("Hora: " + alarma.horas + "\n");
        libs.Input.print("Minutos: " + alarma.minutos + "\n");
        libs.Input.print("Segundos: " + alarma.segundos + "\n");
        libs.Input.print("Pilas: " + alarma.pilas + "\n");

    }

}
