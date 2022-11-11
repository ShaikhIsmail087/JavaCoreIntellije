package com.logical;

public class LogicCountNumberOfDigits {
    public static void main(String[] args) {
        int num=987654321;
        int count=0;
        while (num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println("Number of digits are "+count);
    }
}
