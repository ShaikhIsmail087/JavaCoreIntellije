package com.logical;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Max element in array:"+max);
        System.out.println("Min element in array:"+min);
        System.out.println("Max difference element in array:"+(max-min));
    }
}
