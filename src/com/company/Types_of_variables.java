package com.company;

import java.sql.SQLOutput;

public class Types_of_variables {
    int x;
    public void buy()
    {
        int i;
        for (i=1;i<=5;i++)
        {
            System.out.println(i);
        }
        x=i;
       // harvesting();
    }
    Types_of_variables() {
        int a = x;
        System.out.println(a);
        buy();
    }
    public static void main(String[] args) {
       // System.out.println(x);
        Types_of_variables v1=new Types_of_variables();
        //v1.harvesting();
    }
}
