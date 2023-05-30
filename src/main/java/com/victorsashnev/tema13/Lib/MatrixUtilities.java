package com.victorsashnev.tema13.Lib;

import java.util.Random;

public class MatrixUtilities<T,R> {
    static Random rand = new Random();
    public static int randomNumeber(int max, int min){
        int numb;
        return numb= rand.nextInt(max- min + 1) + min;
    }
    public static double randomNumeberDouble(double max, double min){
        double numb;
        return numb= rand.nextDouble()*max+min;
    }
     public static int confirmIfelementExistsInteger(int[][] matrix, int num){
            for (int i = 0; i < matrix.length;i++){
                for (int j = 0; j < matrix[i].length;j++){
                    if(matrix[i][j] == num){
                        return 1;
                    }
                }
            }
        return -1;
     }

    public static int confirmIfelementExistsString(String[][] matrix, String text){
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix[i].length;j++){
                if(matrix[i][j].equalsIgnoreCase(text)){
                    return 1;
                }
            }
        }
        return -1;
    }

    public static String printOutElement(int[][] matrix, int num){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix[i].length;j++){
                if(matrix[i][j] == num){
                    sb.append(matrix[i][j]);
                }
            }
        }
        return sb.toString();
    }

    public static String printOutElement(String[][] matrix, String text){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix[i].length;j++){
                if(matrix[i][j].equalsIgnoreCase(text)){
                    sb.append(matrix[i][j]);
                }
            }
        }
        return sb.toString();
    }

     public static String printOutMatrix(Object[][] R){
        StringBuilder sb = new StringBuilder();
         for (int i = 0; i < R.length;i++){
             for (int j = 0; j < R[i].length;j++){
                sb.append(R[i][j]);
             }
         }
         return sb.toString();
     }
}
