package com.victorsashnev.tema13.Ejer02;

import com.victorsashnev.tema13.Ejer01.Hilo;

public class Ejer02 {
    public static void main(String[] args){
        Hilo hilo1 = new Hilo("Ejer2");
        Hilo hilo2 = new Hilo("Ejer2 pt2");
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        hilo2.start();
    }
}
