package com.testAutomationCoach.cMethods;


public class EjemploGuitarra {

    public static void main(String[] args) {


        Musico musico1 = new Musico();
        musico1.nombreMusico = "Musico 1";
        musico1.edadMusico = 30;

        Musico musico2 = new Musico();
        musico2.nombreMusico = "Musico 2";
        musico2.edadMusico = 34;

        Musico musico3 = new Musico();
        musico3.nombreMusico = "Musico 3";
        musico3.edadMusico = 32;

        Persona persona = new Persona();
        persona.tipoMusico = "Rock";

        Musico[] rockeros = new Musico[100];
        rockeros[0]=musico1;
        rockeros[1]=musico2;
        rockeros[2]=musico3;
        persona.musicos = rockeros;

    }

}
