package com.logical;

import java.util.Scanner;

public class LogicReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        //1) using algorithm
        /*int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse Number is:"+rev);*/

        //2) Using StringBuffer class

        /*StringBuffer sb=new StringBuffer(String.valueOf(num));
        sb.reverse();
        System.out.println(sb);*/

        //3) Using StringBuilder class
        StringBuilder s=new StringBuilder(String.valueOf(num));
        s.reverse();
        System.out.println(s);
    }
}
