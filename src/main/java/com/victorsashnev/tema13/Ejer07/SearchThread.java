package com.victorsashnev.tema13.Ejer07;

public class SearchThread extends Thread{
    private final int[] aray;
    private final int search;
    private final int begin;
    private final int end;

    public SearchThread(int[] aray,int search,int begin, int end){
        this.aray = aray;
        this.search = search;
        this.begin = begin;
        this.end = end;
    }
    @Override
    public void run(){
        for(int i = begin; i < end;i++){
            if(aray[i] == search){
                System.out.println("Element found");
            }
        }
    }
}
