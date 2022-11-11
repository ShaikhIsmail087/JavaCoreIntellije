package com.logical;

public class LogicSumOfArray {
    public static void main(String[] args) {
        int[] a={5,2,7,9,6};
        int sum=0;
        /*for (int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }*/
        //Enhanced for loop
        for (int i:a)
        {
            sum=sum+i;
        }
        System.out.println("Sum of Array:"+sum);
    }
}
