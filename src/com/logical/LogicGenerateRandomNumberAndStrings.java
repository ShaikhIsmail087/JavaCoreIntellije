package com.logical;

import java.util.Random;

public class LogicGenerateRandomNumberAndStrings {
    public static void main(String[] args) {
        //Approach 1- Random
        Random ran=new Random();
        int ran_num = ran.nextInt(1000);
        System.out.println(ran_num);

        double ran_dbl= ran.nextDouble(); //range 0.0 and less than 1.0
        System.out.println(ran_dbl);

        //Approach 2- Math
        System.out.println(Math.random());

        //Approach 3- Apache commons-lang API

    }
}
