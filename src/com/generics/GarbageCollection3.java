package com.generics;

public class GarbageCollection3 {
    static int count=0;
    public static void main(String[] args) {
        for (int i=0;i<10;i++)
        {
            GarbageCollection g=new GarbageCollection();
            g=null;
        }
    }
    public void finalize()
    {
        System.out.println("Finalize method called:"+ ++count);
    }
}
