package com.victorsashnev.tema13.Ejer07;

import java.time.Duration;
import java.time.Instant;

public class SearchThread extends Thread{
    private final int[] aray;
    private final int search;
    private final int begin;
    private final int end;
    private SearchListerner searchListerner;
    public SearchThread(int[] aray,int search,int end, int begin){
        this.aray = aray;
        this.search = search;
        this.begin = begin;
        this.end = end;
    }
    @Override
    public void run(){
        Instant inst1 = Instant.now();
        for(int i = begin; i < end;i++){
            if(aray[i] == search){
                Instant inst2 = Instant.now();
                System.out.println("Element found");
                //System.out.println(aray[i]);
                System.out.println("Elapsed Time: "+ Duration.between(inst1, inst2).toString());
                //Post - Correctionç
                //searchListerner.found(i);
                break;
            }
        }
    }

}
