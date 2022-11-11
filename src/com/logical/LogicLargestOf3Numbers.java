package com.logical;

import java.util.Scanner;

public class LogicLargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a=sc.nextInt();

        System.out.println("Enter Second Number:");
        int b=sc.nextInt();

        System.out.println("Enter Third Number:");
        int c=sc.nextInt();
        //Logic -Approach 1

        /*if(a>b && a>c)
        {
            System.out.println(a+" is Largest Number");
        } else if (b>a && b>c) {
            System.out.println(b+" is largest Number");
        }
        else
        {
            System.out.println(c+" is largest Number");
        }*/

        //Logic -Approach 2 (Ternary operator)
        int largest1 = a > b ? a : b; //largest of a & b
        int largest2 = c > largest1 ? c : largest1; //largest of c & largest1

        int largest=c >( a > b ? a : b) ? c : (a > b ? a : b);
        System.out.println(largest+" is Largest Number");
    }
}
