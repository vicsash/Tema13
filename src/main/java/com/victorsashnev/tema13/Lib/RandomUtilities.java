package com.victorsashnev.tema13.Lib;


import java.util.Random;

public class RandomUtilities {
    static Random  rand = new Random();
    public static int randomNumeber(int max, int min){
        return rand.nextInt(max - min + 1) + min;
    }
    public static double randomNumeberDouble(double max, double min){
        double numb;
        return numb= rand.nextDouble()*max+min;
    }

}
