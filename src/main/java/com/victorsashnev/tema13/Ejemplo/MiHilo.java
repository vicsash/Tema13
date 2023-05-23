package com.victorsashnev.tema13.Ejemplo;

public class MiHilo extends Thread{
    private int contador;
    public MiHilo(String nombre){
        //
        super(nombre);
        contador = 0;
        System.out.println("Creando el hilo......" + getName());
    }
    @Override
    public void run(){
        System.out.println("Ejecutando el hilo....." + getName());
        for(int i = 1; i <=100;i++){
            System.out.println(i + " soy " +getName());

        }
        if(contador% 2 ==0){
            System.out.println("Es par " + contador);
        }
        System.out.println("Finalizando " + getName());
    }
}
