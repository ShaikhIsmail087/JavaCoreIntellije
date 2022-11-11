package com.company;

public class LogicDemo {
    public static void arr(int[] a)
    {
        int i,largest=0,smallest=0;
        System.out.println("array iterating:");
        for ( i=0;i<a.length;i++)
        {
            if (a[0]<largest) {
                largest = a[0];
            }
            if (a[0]>smallest) {
                smallest= a[0];
            }
            System.out.print(a[i]+" ");
        }
        System.out.println("largest: "+largest+" "+"smallest: "+smallest);
    }
    public static void main(String[] args) {
        int[] a={1,23,3,4,45};
        arr(a);
    }
}
