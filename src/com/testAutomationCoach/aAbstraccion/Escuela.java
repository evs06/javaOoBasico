package com.testAutomationCoach.aAbstraccion;

public class Escuela {
    //edificios, salones, personas: directivo, maestro, aseistente, alumnos, materias, mobiliario
    Edificio[] edificios;
    Persona[] personal;
}

class Edificio  {
    int numEdif;
    double areaEdificio;
    Salon[] salones;
    CuartoBano[] banos;
}

class Salon {
    String id;
    int capacidad;
    Inmobiliario[] muebles;
    //Butacas[] butaca;
}

class CuartoBano {
    String id;
    int capacidad;
    Inmobiliario[] muebles;
    //Butacas[] butaca;
}


class Inmobiliario {
    String idInventario;
    String tipo;
}

class Persona {
    String nombre;
    char sex;
    String cargo;


}
