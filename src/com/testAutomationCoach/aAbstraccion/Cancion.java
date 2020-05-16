package com.testAutomationCoach.aAbstraccion;

public class Cancion {
    //atributos: titulo, artista, duracion, letra, anio lanzamiento
    //metodos reproducir, editar, grabar, etc...

    //atributos: titulo, artista, duracion, letra, anio lanzamiento
    String titulo;
    String artista;
    int duracionSegundos;
    String letra;
    String nuevaLetra;
    int anioLanzamiento;
    Boolean esCover;
    //metodos reproducir, editar, grabar, etc...

    public Cancion(String tituloCancion, String artista) {
        this.titulo = tituloCancion;
        this.artista = artista;
    }

    public Cancion(){

    }

    public void reproducir() {
        System.out.println(this.letra);
    }

    public void editar(String nuevaLetra) {

        this.nuevaLetra = nuevaLetra;
    }

    public void grabar(String letra, int duracionSegundos, int anioLanzamiento) {
        this.letra = letra;
        this.duracionSegundos = duracionSegundos;
        this.anioLanzamiento = anioLanzamiento;
    }

}
