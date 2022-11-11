package com.company;

import java.lang.reflect.Method;

public class ExceptionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c=Class.forName("java.lang.Class");
        Class[] s=c.getDeclaredClasses();
        int cnt=0;
        for (Class c1:s)
        {
            cnt++;
            System.out.println(c1.getName());
        }
        System.out.println("Total Method-->>>>"+cnt);
    }
}
