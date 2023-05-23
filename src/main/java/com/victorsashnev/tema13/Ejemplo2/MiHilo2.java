package com.victorsashnev.tema13.Ejemplo2;
    public class MiHilo2 implements Runnable{
        private String nombre;
        public MiHilo2(String nombre){
            this.nombre = nombre;
            System.out.println("Creando el hilo......" + nombre);
        }
        @Override
        public void run(){
            System.out.println("Ejecutando el hilo....." + nombre);
            for(int i = 1; i <=100;i++){
                System.out.println(i + " soy " +nombre);
            }
            System.out.println("Finalizando " + nombre);
        }
    }

