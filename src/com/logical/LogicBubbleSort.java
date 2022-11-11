package com.logical;

import java.util.Arrays;

public class LogicBubbleSort {
    public static void main(String[] args) {
        int[] a={40,2,100,50,3};
        System.out.println("Array before sorting:"+ Arrays.toString(a));
        int n=a.length;
        for (int i=0;i<a.length-1;i++)  //Number of passes
        {
            for (int j=0;j<a.length-1;j++)   //Iteration in each passes
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Array After sorting:"+ Arrays.toString(a));
    }
}
