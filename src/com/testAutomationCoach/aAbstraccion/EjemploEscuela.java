package com.testAutomationCoach.aAbstraccion;

public class EjemploEscuela {


    public static void main(String[] args) {


        Persona dire = new Persona();
        dire.nombre = "Elizabeth Warren";
        dire.sex = 'F';
        dire.cargo = "Directora";

        Persona prof= new Persona();
        prof.nombre = "Elizabeth Lopez";
        prof.sex = 'F';
        prof.cargo = "Profesor";

        Persona inte = new Persona();
        inte.nombre = "Juan Pérez";
        inte.sex = 'M';
        inte.cargo = "Intendente";

        Persona secre = new Persona();
        secre.nombre = "Juanita Pérez";
        secre.sex = 'F';
        secre.cargo = "Secretaria";

        Inmobiliario mesa = new Inmobiliario();
        mesa.idInventario="1";
        mesa.tipo="mesa";

        Inmobiliario silla = new Inmobiliario();
        silla.idInventario="2";
        silla.tipo="silla";

        Inmobiliario boteBasura = new Inmobiliario();
        boteBasura.idInventario="1";
        boteBasura.tipo="Bote de Basura";

        Inmobiliario tazaBano = new Inmobiliario();
        tazaBano.idInventario="1";
        tazaBano.tipo="Taza Baño";

        Inmobiliario pizarron = new Inmobiliario();
        pizarron.idInventario="1";
        pizarron.tipo="Pizarron";

        Salon primeroA = new Salon();
        primeroA.id = "1A";
        primeroA.capacidad = 45;

        Salon primeroB = new Salon();
        primeroB.id = "1B";
        primeroB.capacidad = 40;

        CuartoBano bano = new CuartoBano();
        bano.id = "1";
        bano.capacidad = 7;

        Inmobiliario[] mueblesPrimeroA = new Inmobiliario[100];
        mueblesPrimeroA[0] = mesa;
        mueblesPrimeroA[1] = silla;
        primeroA.muebles = mueblesPrimeroA;

        Inmobiliario[] mueblesPrimeroB = new Inmobiliario[100];
        mueblesPrimeroB[0] = mesa;
        mueblesPrimeroB[1] = silla;
        primeroB.muebles = mueblesPrimeroB;

        Inmobiliario[] inmbolirialioBano = new Inmobiliario[100];
        inmbolirialioBano[0] = boteBasura;
        inmbolirialioBano[1] = tazaBano;
        bano.muebles = inmbolirialioBano;

        Edificio primaria = new Edificio();
        primaria.numEdif = 1;
        primaria.areaEdificio = 1000.0;
        primaria.salones = new Salon[12];
        primaria.banos = new CuartoBano[10];
        primaria.salones[0] = primeroA;
        primaria.salones[1] = primeroB;
        primaria.banos[0] = bano;

        Escuela morelos = new Escuela();
        morelos.edificios = new Edificio[3];
        morelos.personal = new Persona[200];

        morelos.edificios[0] = primaria;
        morelos.personal[0] = dire;
        morelos.personal[1] = prof;
        morelos.personal[2] = inte;
        morelos.personal[3] = secre;

    }


}
