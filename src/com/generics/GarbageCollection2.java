package com.generics;

public class GarbageCollection2 {
    static GarbageCollection2 s;
    public static void main(String[] args) throws InterruptedException {
        GarbageCollection g=new GarbageCollection();
        System.out.println(g.hashCode());
        try {
            g=null;
        }catch (Exception e){}
        System.gc();
        Thread.sleep(1000);
        try {
            System.out.println(s.hashCode());
        }catch (Exception e){}
        s=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("End of main");
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Finalize method called");
        s=this;
    }
}
