package com.logical;

import java.util.Scanner;

public class LogicPalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.next();
        String org_s=s;
        int len=s.length();
        String rev="";
        for (int i=len-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if (org_s.equals(rev))
        {
            System.out.println(org_s+" is palindrome String");
        }
        else
        {
            System.out.println(org_s+" is not palindrome String");
        }
    }
}
