package com.generics;

import java.util.ArrayList;

public class GenericNonGen {
    public static void m1(ArrayList l)
    {
        l.add(10);
        l.add(10.5);
        l.add(true);
    }
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        l.add("Durga");
        l.add("Ravi");
        //l.add(10);
        m1(l);
        System.out.println(l);
        //l.add(10.5);
        ArrayList l2=new ArrayList<String>();
        l2.add(10);
        l2.add(10.5);
        l2.add(true);
        System.out.println(l2);
    }
}
