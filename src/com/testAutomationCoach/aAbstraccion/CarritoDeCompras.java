package com.testAutomationCoach.aAbstraccion;

public class CarritoDeCompras {

    public String marca;
    public String modelo;
    public int llantas;
    public int carga;
    public String volante;

    public void avanzaradelante(int llantas, String volante ){
        System.out.println("Adelante...");
    }

    public void avanzaratras(int llantas, String volante){
        System.out.println("Atrás...");
    }

    public void giraderecha(int llantas, String volante){
        System.out.println("Derecha...");
    }

    public void giraizquierda(int llantas, String volante){
        System.out.println("Izquierda...");
    }

    public void frenar(int llantas, String volante){
        System.out.println("Frenar...");
    }

    public void transportar(int carga){
        System.out.println("Transportando...");
    }

}
