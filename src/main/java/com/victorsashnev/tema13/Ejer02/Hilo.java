package com.victorsashnev.tema13.Ejer02;

public class Hilo extends Thread{
   protected Hilo(String nombre){
        //
        super(nombre);
        System.out.println("Creando el hilo......" + getName());
    }
    @Override
    public void run(){
        System.out.println("Ejecutando el hilo....." + getName());
        for(int i = 1; i <=100;i++){
            System.out.println(i + " Eje2 " +getName());
        }
    }
}
