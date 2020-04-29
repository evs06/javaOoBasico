package com.testAutomationCoach.aAbstraccion;

public class Alarma {

    public int horas;
    public int minutos;
    public int segundos;
    public String marca;
    public String material[] = {"metal","plastico","cobre"};
    public String pilas;

    public void programaralarma(){
        System.out.print("Alarma programada");
    }

    public void encenderalarma(){
        System.out.print("Sonar alarma");
    }

    public void apagaralarma(){
        System.out.print("Apagar alarma");
    }

    public void activaralarma(){
        System.out.print("Activar alarmar");
    }

    public void desactivaralarma(){
        System.out.print("Desactivar alarma");
    }

}
