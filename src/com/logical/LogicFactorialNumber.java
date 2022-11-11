package com.logical;

public class LogicFactorialNumber {
    public static void main(String[] args) {
        int num=10;
        long factorial=1;
        /*for (int i=1;i<=num;i++)
        {
            factorial*=i;
        }*/
        for (int i=num;i>=1;i--)
        {
            factorial*=i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
}
