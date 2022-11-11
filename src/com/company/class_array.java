package com.company;

import java.util.Scanner;

public class class_array {
   static int[] get()
   {
       return new int[]{33,44,55,66};
   }
    public static void main(String[] args) {
        int[] a=get();
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter String:");
            String  s=sc.nextLine();
            if (s.isBlank())
            {
                break;
            }
        }
    }
}

