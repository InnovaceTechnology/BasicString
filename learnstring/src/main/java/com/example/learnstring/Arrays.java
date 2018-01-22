package com.example.learnstring;

/**
 * Created by innovace on 22/1/18.
 */

public class Arrays {

    public static void main(String[] args) {

        int game1 = 100;
        int game2 = 200;
        int game3 = 300;
        int game4 = 400;
        int game5 = 500;

        int[]mArray = new int[5];
        double[] dArray;
        String[]names = new String[3];

        names[0] = "aaa";
        names[1] = "bbb";
        names[2] = "ccc";

        mArray[0] = 200;
        mArray[1] = 400;
        mArray[2] = 600;
        mArray[3] = 800;
        mArray[4] = 1000;
       // mArray[5] = 1200;

        System.out.println("array values 1 : " +mArray[0]);
        System.out.println("array values 2 : " +mArray[1]);
        System.out.println("array values 3 : " +mArray[2]);
        System.out.println("array values 4 : " +mArray[3]);
        System.out.println("array values 5 : " +mArray[4]);

        mArray[0] = 150;
        System.out.println("array values 1 : " +mArray[0]);



        String[] topCars = {"nano","bmw","jackquar","honda"};

        System.out.println("car values : " +topCars[2]);
        System.out.println("tottal cars length : " +topCars.length);
        System.out.println("last car : " +topCars[(topCars.length-1)]);




    }
}
