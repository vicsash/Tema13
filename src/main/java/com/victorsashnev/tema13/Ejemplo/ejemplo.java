package com.victorsashnev.tema13.Ejemplo;

public class ejemplo {
    public static void main(String[] args){
        MiHilo hilo1 = new MiHilo("Pepe");
        MiHilo hilo2 = new MiHilo("Juan");
        hilo1.start();
        hilo2.start();
    }
}
