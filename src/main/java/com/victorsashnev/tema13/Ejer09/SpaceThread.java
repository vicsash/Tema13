package com.victorsashnev.tema13.Ejer09;

import com.victorsashnev.tema13.Lib.RandomUtilities;

import java.sql.SQLOutput;

public class SpaceThread extends Thread{
    private final int num;
    private final int END =500;
    Boolean finish = false;
    SpaceThread(String name,int num){
        super(name);
        this.num= num;
    }
    @Override
    public void run(){
        long startTime = System.currentTimeMillis();
        int position = 0;
        int mov =0;
        int counter;
        StringBuilder sb = new StringBuilder();
        sb.append(getName()+":");
        System.out.println(getName());
        do{
            mov = RandomUtilities.randomNumeber(5,0);
            position = position +mov;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while(position<=END);
        long endTime = System.currentTimeMillis();

        float sec = (endTime - startTime)/1000F;
        System.out.println("Ship" +getName() + "has arrived at " +sec);
    }
}
