package com.victorsashnev.tema13.Ejer05;

public class Ejer05 {
    /*5. Crea un programa que cree n hilos de ejecución, donde n será un número recibido como parámetro
al iniciar el programa (args de la función main). Cada hilo de ejecución tendrá un identificador
único asignado en el momento de la creación. Al iniciarse cada hilo mostrará los primeros 10000
números de la siguiente forma.
“Hilo: ” + IDENTIFICADOR + “ (“ + numero + “)\n”
¿En qué orden se ejecutan los hilos?
*/
    private final static int CANTIDAD = 10000;
   public static void main(String[] args){
       if(args.length != 1){
           System.err.println("Deme indicar el numero de hilos");
           System.exit(1);
       }
       int nHilos = 0;
       try{
           nHilos = Integer.parseInt(args[0]);
       }catch (NumberFormatException nfe){
           System.out.println("Solo numeros por favor");
           System.exit(1);
       }
       Thread[] thread = new Thread[nHilos];
       for(int i = 0; i <thread.length;i++){
           thread[i] = new Thread05("Hilo" + i, CANTIDAD);
           System.out.println("Creando hilo" +thread[i].getName());
           System.out.println("Iniciando hilo "+ thread[i].getName());
           thread[i].start();
       }
   }
}
