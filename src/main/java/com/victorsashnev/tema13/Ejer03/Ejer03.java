package com.victorsashnev.tema13.Ejer03;

public class Ejer03 {
    public Ejer03(){
        Hilo hilo1 = new Hilo("Pepe");

        hilo1.setDaemon(true);
        hilo1.start();
        System.out.println("Fin del hilo");
    }
}
