package com.example.learnstring;

public class Strings {
    public static void main(String[] args) {
        String car = "Honda";
        String make = "soundharya";
        String model = "new model";
        String carDetails = car + " - " +make+ " : " + model ;


        System.out.println(carDetails);

        String name = "SOUNDHARYA";
        String value = name.toLowerCase();

        System.out.println(value);

        String name2 = "soundharya";
        String value2 = name2.toUpperCase();

        System.out.println(value2);


        int accountBalance  = 200;

         String printBalance = String.format("your current account balace is : %d ",accountBalance);

         System.out.println(printBalance);



    }
}
