package com.testAutomationCoach.aAbstraccion;

public class EjemploCancion {

    public static void main(String[] args) {

        Cancion elTriste = new Cancion();
        elTriste.grabar("Triste", 3000, 2020);
        elTriste.editar("Que triste fue decirnos adiós");
        elTriste.esCover = true;
        elTriste.reproducir();

        Cancion ramitoDeVioletas = new Cancion("Ramito de Violetas", "Mi Banda el Mexicano");
        ramitoDeVioletas.grabar("Ramito de Violetas", 2400, 1999);
        ramitoDeVioletas.editar("Era feliz en su matrimonio");
        ramitoDeVioletas.reproducir();

    }

}
