package com.java8features;

//@FunctionalInterface
//interface interf{
//    public int m1(int a,int b);
//}
public class LambdaExpression {
    public static void main(String[] args) {
        Runnable r=()-> {
                for (int i=1;i<=5;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("child thread "+i);
                }
        };
        Thread t1=new Thread(r);
        t1.start();
        for (int i=1;i<=5;i++){
            System.out.println("main thread "+i);
        }
    }
}
