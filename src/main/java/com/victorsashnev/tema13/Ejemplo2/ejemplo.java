package com.victorsashnev.tema13.Ejemplo2;

public class ejemplo {
    public static void main(String[] args){
        MiHilo hilo1 = new MiHilo("Pepe");
        MiHilo hilo2 = new MiHilo("Juan");
        Thread hilo3 = new Thread(new MiHilo2(("Alicia")));
        hilo1.start();

        try {
            hilo1.join();
            hilo3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        hilo2.start();
        hilo3.start();

    }
}
