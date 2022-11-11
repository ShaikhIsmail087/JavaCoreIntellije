package com.java8features;
interface interf
{
    public void add(int a,int b);
}
public class LambdaExMethodRef1 {
    public static void sum(int a,int b){
        System.out.println("The Sum:"+(a+b));
    }
    public static void main(String[] args) {
        interf i=(a,b)-> System.out.println("The Sum:"+(a+b));
        i.add(10,20);

        interf i1=LambdaExMethodRef1::sum;
        i1.add(100,200);
    }
}
