package com.generics;

public class GarbageCollection {
    public static void main(String[] args) {
//        String s=new String("Ismail");
        GarbageCollection s=new GarbageCollection();
        s=null;
        System.gc();
        System.out.println("End of main");
    }

//    @Override
//    public void finalize() throws Throwable {
//        System.out.println("Finalize method called");
//    }
}
