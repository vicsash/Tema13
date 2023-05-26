package com.victorsashnev.tema13.Ejer08;


public class PrimeNumerCounter extends Thread{
    private int counter = 0 ;
    private final int[] aray;
    private final int begin;
    private final int end;

    public PrimeNumerCounter(int[] aray, int begin, int end){
        this.aray = aray;
        this.begin = begin;
        this.end = end;
    }
    @Override
    public void run(){
        int div;
        int counter = 0;
        for(int i = begin; i <= end;i++){
            for(int j = 1 ; j <= begin ;j++){
                div= i % j;
                if(div==0){
                    counter++;
                }
                if(counter <= 2){
                    Ejer08.primCounter++;
                }
            }
        }
    }

}
