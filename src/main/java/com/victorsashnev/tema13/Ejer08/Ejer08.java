package com.victorsashnev.tema13.Ejer08;

import com.victorsashnev.tema13.Lib.RandomUtilities;

import java.util.ArrayList;

public class Ejer08 {
    protected static int primCounter = 0;

    public static void main(String[] args){
        final int CORE = 4;
        final int ARRAY_SIZE = 80;
        int[]aray = new int[ARRAY_SIZE];
        for(int i = 0 ; i < aray.length; i++){
            aray[i]= RandomUtilities.randomNumeber(1000,0);
        }
        ArrayList<Limits> lim = new ArrayList<>();
        lim.add(new Limits(20,0));
        lim.add(new Limits(40,21));
        lim.add(new Limits(60,40));
        lim.add(new Limits(aray.length,61));

        PrimeNumerCounter[] search = new PrimeNumerCounter[CORE];
        for(int i = 0; i < search.length;i++){

            search[i] = new PrimeNumerCounter(aray,lim.get(i).getMIN(),lim.get(i).getMAX());
            search[i].start();
        }
        for(int i = 0; i < search.length;i++){
            try {
                search[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(primCounter);

    }


}
