package com.victorsashnev.tema13.Ejer04;

public class Hilo04 extends Thread{
    public Hilo04(String nombre){
        //
        super(nombre);
        System.out.println("Creando el hilo......" + getName());
    }
    @Override
    public void run(){
        System.out.println("Ejecutando el hilo....." + getName());
        for(int i = 1; i <=100;i++){
            System.out.println(i + " deam " +getName());
        }
    }
}
