package com.victorsashnev.tema13.Ejer01;

public class Hilo extends Thread{
    public Hilo(String nombre){
        //
        super(nombre);
        System.out.println("Creando el hilo......" + getName());
    }
    @Override
    public void run(){
        System.out.println("Ejecutando el hilo....." + getName());
        for(int i = 1; i <=100;i++){
            System.out.println(i + " Eje1 " +getName());
        }
        System.out.println("Finalizando " + getName());
    }
}
