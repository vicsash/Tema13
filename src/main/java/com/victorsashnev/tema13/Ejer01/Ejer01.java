package com.victorsashnev.tema13.Ejer01;

import com.victorsashnev.tema13.Ejemplo.MiHilo;

public class Ejer01 {
    public static void main(String[] args){
            Hilo hilo1 = new Hilo("Ejer1");
            Hilo hilo2 = new Hilo("Ejer1 pt2");
            hilo1.start();
            hilo2.start();
    }
}
