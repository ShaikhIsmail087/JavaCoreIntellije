package com.company;

import java.util.Random;
import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//            System.out.print("Enter user number: ");
//            int number = sc.nextInt();
//            sc.nextLine();
//            System.out.print("Enter user name: ");
//            String name =sc.nextLine();
//
//            System.out.println("user number : "+number+"\n"+"user name : "+name);
        Random r=new Random();
            String otp="";
            for (int i=0;i<4;i++)
            {
                otp=otp+(int)(Math.random()*10);
            }
        System.out.println(otp);
    }
}
