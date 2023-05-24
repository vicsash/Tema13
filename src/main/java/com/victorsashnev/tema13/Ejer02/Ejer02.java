package com.victorsashnev.tema13.Ejer02;

public class Ejer02 {
    public static void main(String[] args){
        Hilo hilo1 = new Hilo("Ejer2");

        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fin del hilo");
    }
}
