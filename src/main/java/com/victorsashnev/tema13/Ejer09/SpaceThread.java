package com.victorsashnev.tema13.Ejer09;

import com.victorsashnev.tema13.Lib.RandomUtilities;

import java.sql.SQLOutput;

public class SpaceThread extends Thread{
    private final int num;
    private final int END =100;
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
            System.out.print(getName());
            for(int i = 0; i <position;i++){
                System.out.print("#");
            }
            System.out.print("\r");


           try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.flush();
        }while(position<=END);
        long endTime = System.currentTimeMillis();

        float sec = (endTime - startTime)/1000F;
        System.out.println("Ship" +getName() + "has arrived at " +sec);
    }
}
