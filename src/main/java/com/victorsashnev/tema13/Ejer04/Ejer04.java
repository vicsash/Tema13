package com.victorsashnev.tema13.Ejer04;

public class Ejer04 {
    public Ejer04(){
        Hilo04 hilo1 = new Hilo04("Pepe");

        hilo1.setDaemon(true);
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Fin del hilo04");
    }
}
