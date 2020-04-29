package com.testAutomationCoach.aAbstraccion;

public class Cancion {
    //atributos: titulo, artista, duracion, letra, anio lanzamiento
    //metodos reproducir, editar, grabar, etc...

    public String titulo;
    public String artista;
    public double duracion;
    public String letra;
    public int anLanza;
    public double genero;

    public void reproducir(){
        System.out.print("Reproduciendo...");
    }

    public void editar(){
        System.out.print("Editar canción");
    }

    public void grabar(){
        System.out.print("Grabando...");
    }

    public void copiar(){
        System.out.print("Copiada");
    }

    public void pausar(){
        System.out.print("Pausar canción");
    }

    public void detener(){
        System.out.print("Canción detenida");
    }

    public void eliminar(){
        System.out.print("Canción eliminada");
    }

    public void regresar(){
        System.out.print("Regresando...");
    }

    public void adelantar(){
        System.out.print("Adelantando...");
    }

}
