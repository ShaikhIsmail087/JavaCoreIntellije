package com.company;

public class HeapDemo {
    public static void main(String[] args) {
        double mb=1024*1024;
        Runtime r=Runtime.getRuntime();
        System.out.println("Max memory:"+r.maxMemory()/mb);
        System.out.println("Total memory:"+r.totalMemory()/mb);
        System.out.println("Free memory:"+r.freeMemory()/mb);
        System.out.println("Consumed memory:"+(r.totalMemory()-r.freeMemory())/mb);
    }
}
