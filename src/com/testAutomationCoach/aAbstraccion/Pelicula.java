package com.testAutomationCoach.aAbstraccion;

import java.util.Date;

public class Pelicula {

    public String nombrePelicula;
    public String actores;
    public String produccion;
    public String duracion;



    public void reproducir(String nombrPelicula){
        System.out.println("Reproduciendo...");
    }

    public void adelantar(){
        System.out.println("Adelantando...");
    }

    public void atrasar(){
        System.out.println("Atrasando...");
    }

    public void pausar(){
        System.out.println("Pausa");
    }

    public void stop(){
        System.out.println("Stop");
    }

}
