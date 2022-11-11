package com.company;

public class Fibo {
    //2) with recursion
    static int a=0,b=1,c=0;
    static void fibo()
    {
        System.out.print(a+" "+b+" ");
        for(int i=0;i<=7;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        fibo();
        //1) without recursion
       /* int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<=5;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }*/
    }
}
