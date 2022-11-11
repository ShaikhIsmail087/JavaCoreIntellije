package com.java8features;
interface Left{
    default void m1(){
        System.out.println("default implementation Left");
    }
    public static void m2(){
        System.out.println("interface static method");
    }
}
interface Right{
    default void m1(){
        System.out.println("default implementation Right");
    }

    public static void main(String[] args) {
        System.out.println("interface main method");
    }
}
public class DefaultMethodInInterface implements Left,Right{
    @Override
    public void m1() {
//        System.out.println("our own implementation");
        Left.super.m1();
    }

    public static void main(String[] args) {
        DefaultMethodInInterface d=new DefaultMethodInInterface();
        d.m1();
        Left.m2();
    }
}
