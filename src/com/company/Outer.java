package com.company;

import java.util.*;

public class Outer {
    int x=1000;
            class Inner
            {
                int x=100;
                public void inner()
                {
                    int x=10;
                    System.out.println("local variable="+x);
                    System.out.println("inner class instance variable="+this.x);
                    System.out.println("outer class instance variable="+Outer.this.x);
                }
            }

    public static void main(String[] args) {
        new Outer().new Inner().inner();
    }
}
