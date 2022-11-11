package com.company;

import java.util.Scanner;

public class Prime_num
{
    static int cnt=0;
    {
        cnt++;
    }
    public static void main(String[] args)
    {
        new Prime_num();
        new Prime_num();
        new Prime_num();
        new Prime_num();
        new Prime_num();
        System.out.println(cnt);
       // Scanner sc=new Scanner(System.in);
       // System.out.print("Enter your number: ");
       // int no=sc.nextInt();
        for (int no=2;no<=100;no++)
        {
            int temp = 0;
            for (int j = 2; j <= no - 1; j++) {
                if (no % j == 0)
                    temp = temp + 1;
            }
            if (temp == 0) {
                System.out.println(no + " is prime.");
            }
            else
            {
                temp=0;
            }
        }
    }
}
