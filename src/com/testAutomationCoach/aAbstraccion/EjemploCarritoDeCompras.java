package com.testAutomationCoach.aAbstraccion;

public class EjemploCarritoDeCompras {

    public static void main(String[] args) {

        CarritoDeCompras carrito = new CarritoDeCompras();

        carrito.marca = "Soriana";
        carrito.modelo = "2018";
        carrito.volante = "Plano";
        carrito.llantas = 4;
        carrito.carga = 150;


        carrito.avanzaradelante(4, "Plano" );
        carrito.avanzaratras(4, "Plano" );
        carrito.giraderecha(4, "Plano" );
        carrito.giraizquierda(4, "Plano" );
        carrito.frenar(4, "Plano" );
        carrito.transportar(200 );



        libs.Input.print("\nEl carrito de compras es de marca: " + carrito.marca + "\n");
        libs.Input.print("\nEl carrito de compras es el modelo: " + carrito.modelo + "\n");
        libs.Input.print("\nEl carrito de compras tiene un volante: " + carrito.volante + "\n");
        libs.Input.print("\nEl carrito de compras tiene: " + carrito.llantas + " llantas\n");
        libs.Input.print("\nEl carrito de compras pueda transportar: " + carrito.marca + " kilos\n");



    }

}
