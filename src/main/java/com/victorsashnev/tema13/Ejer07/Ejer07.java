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
            aray[i]= RandomUtilities.randomNumeber(25,0);
        }
        final int num = 5;
        ArrayList<Limits> lim = new ArrayList<>();
        lim.add(new Limits(0,20));
        lim.add(new Limits(21,40));
        lim.add(new Limits(41,60));
        lim.add(new Limits(61,80));

        SearchThread[] search = new SearchThread[CORE];
       /* search[count] = new SearchThread(aray,num,0,20);
        search[count].start();
        count++;
        search[count] = new SearchThread(aray,num,21,40);
        search[count].start();
        count++;
        search[count] = new SearchThread(aray,num,41,60);
        search[count].start();
        count++;
        search[count] = new SearchThread(aray,num,61,80);
        search[count].start();*
        */
        //HACER MEDIDA DE TIEMPO
        for(int i = 0; i < search.length;i++){
            search[i] = new SearchThread(aray,num,lim.get(i).getMAX(),lim.get(i).getMIN());
            search[i].start();
        }


    }
}
