package com.logical;

import java.util.Scanner;

public class LogicPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int org_num=num;
        int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if (org_num==rev)
        {
            System.out.println(org_num+" is palindrome Number");
        }
        else
        {
            System.out.println(org_num+" is not palindrome Number");
        }
    }
}
