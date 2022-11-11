package com.java8features;

public class LambdaExMethodRef {
    private int m1()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("Child thread-1");
        }
        return 10;
    }
    public static void main(String[] args) {
        LambdaExMethodRef l=new LambdaExMethodRef();
        Runnable r=l::m1;//instance method reference
       // Runnable r=LambdaExMethodRef::m1;//static method reference
        Thread t=new Thread(r);
        t.start();
        for (int i=0;i<10;i++)
        {
            System.out.println("Main thread-1");
        }
    }
}
