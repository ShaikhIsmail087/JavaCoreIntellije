package com.company;

import java.util.Scanner;

public class practice01 {
    public static void main(String arg[]){
        int x=100;
       Scanner sc=new Scanner(System.in);
        System.out.print("user entered number:");
        int y=sc.nextInt();
        if (x>y)
            System.out.println("given number is greater:"+x+"\nuser entered number is:"+y);
        else
            System.out.println("user entered number is greater:"+y+"\ngiven number is:"+x);
    }
}
