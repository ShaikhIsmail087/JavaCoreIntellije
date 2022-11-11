package com.logical;

public class LogicCountEvenAndOddDigits {
    public static void main(String[] args) {
        int num=182834569;
        int even_count=0;
        int odd_count=0;
        while (num>0) //1234  123  12  1
        {
            int rem=num%10; //4  3  2  1
            if (rem%2==0)
            {
                even_count++; //1  2
            }
            else
            {
                odd_count++; //1  2
            }
            num=num/10;  //123  12  1  0
        }
        System.out.println("Total Even Numbers are "+even_count);
        System.out.println("Total Odd Numbers are "+odd_count);
    }
}
