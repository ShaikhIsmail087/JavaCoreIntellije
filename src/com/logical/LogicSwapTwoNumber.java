package com.logical;

public class LogicSwapTwoNumber {
    public static void main(String[] args) {
        int a=23;
        int b=32;
        System.out.println("Before swapping values are..."+a+" "+b);
        //Logic 1-Third variable
        /*int t=a;
        a=b;
        b=t;*/

        //Logic 2-using +,- without using Third variable
        /*a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b; //30-10=20*/

        //Logic 3-using *,/ without using Third variable
        //here a & b should not be zero
        /*a=a*b; //10*20=200
        b=a/b; //200/20=10
        a=a/b; //200/10=20*/

        //Logic 4-using XOR ^
        /*a=a^b; //10^20=30
        b=a^b; //30^20=10
        a=a^b; //30^10=20*/

        //Logic 5-using Single statement
        b=a+b-(a=b);
        System.out.println("After swapping values are..."+a+" "+b);
    }
}
