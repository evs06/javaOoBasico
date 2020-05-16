package com.testAutomationCoach.aAbstraccion;

import java.util.Date;

public class EjemploPelicula {

    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula();

        pelicula.nombrePelicula = "Naranja Mecanica";
        pelicula.actores = "Actores";
        pelicula.produccion = "Warner Bros";
        pelicula.duracion = "02:18:30";

        pelicula.reproducir("Naranja Mecanica");
        pelicula.adelantar();
        pelicula.atrasar();
        pelicula.pausar();
        pelicula.stop();

        libs.Input.print("\nLa película es: " + pelicula.nombrePelicula + "\n");
        libs.Input.print("\nLos actores de la película son: " + pelicula.actores + "\n");
        libs.Input.print("\nLa producción de la película es: " + pelicula.produccion + "\n");
        libs.Input.print("\nLa duración de la película es: " + pelicula.duracion + "\n");
    }

}
