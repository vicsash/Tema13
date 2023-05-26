package com.victorsashnev.tema13.Ejer09;

public class Ejer09 {
   public Ejer09 (){
            SpaceThread Soyuz = new SpaceThread("Soyuz",1);
            SpaceThread Falcon = new SpaceThread("Falcon",2);
            SpaceThread  Changzheng = new SpaceThread("Changzheng",3);
            SpaceThread Proton = new SpaceThread("Proton",4);

            Soyuz.start();
            Falcon.start();
            Changzheng.start();
            Proton.start();

   }
}
