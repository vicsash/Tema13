package com.victorsashnev.tema13.Ejemplo2;

public class MiHilo extends Thread{
    private int contador;
    public MiHilo(String nombre){
        super(nombre);
        System.out.println("Creando el hilo......" + getName());
    }
    @Override
    public void run(){
        System.out.println("Ejecutando el hilo....." + getName());
        for(int i = 1; i <=100;i++){
            System.out.println(i + " soy " +getName());
        }
        System.out.println("Finalizando " + getName());
    }
}
