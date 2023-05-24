package com.victorsashnev.tema13.Ejer05;

public class Thread05 extends Thread {
    private String nombre;
    private final int cantidad;
    public Thread05(String nombre, int cantidad){
        super(nombre);
        this.cantidad = cantidad;
        System.out.println("Creando el hilo......" + nombre);
    }
    @Override
    public void run(){
        System.out.println("Ejecutando el hilo....." + nombre);
        for(int i = 1; i <= cantidad;i++){
            System.out.println(i + " soy " +nombre);
        }
        System.out.println("Finalizando " + nombre);
    }

}
