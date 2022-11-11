package com.logical;

import java.util.Scanner;

public class LogicCountTheWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        int count=0;
        for (int i=0;i<s.length()-1;i++)
        {
            if (s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println("Number of words in a string:"+count);
    }
}
