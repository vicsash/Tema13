package com.victorsashnev.tema13.Ejer07;
import com.victorsashnev.tema13.Lib.*;

import java.util.ArrayList;
import java.util.Random;

public class Ejer07 {

    public static void main(String[] args){
        final int CORE = 4;
        final int ARRAY_SIZE = 80;
        int count = 0;
        int[]aray = new int[ARRAY_SIZE];
        for(int i = 0 ; i < aray.length; i++){
            aray[i]= RandomUtilities.randomNumeber(75,0);
        }
        final int num =RandomUtilities.randomNumeber(75,0) ;
        ArrayList<Limits> lim = new ArrayList<>();
        lim.add(new Limits(20,0));
        lim.add(new Limits(40,21));
        lim.add(new Limits(60,40));
        lim.add(new Limits(aray.length,61));

        SearchThread[] search = new SearchThread[CORE];
        for(int i = 0; i < search.length;i++){

            search[i] = new SearchThread(aray,num,lim.get(i).getMAX(),lim.get(i).getMIN());
            search[i].start();
        }


    }

}
