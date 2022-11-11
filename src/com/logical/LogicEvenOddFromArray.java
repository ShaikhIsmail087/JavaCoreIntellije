package com.logical;

public class LogicEvenOddFromArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        //Extracting even number.......
        /*System.out.println("Even numbers in array.......");
        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2==0)
                System.out.println(a[i]);
        }
        System.out.println("Odd numbers in array.......");
        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2!=0)
                System.out.println(a[i]);
        }*/
        //Enhanced for loop
        System.out.println("Even numbers in array.......");
        for (int i:a)
        {
            if (i%2==0)
                System.out.println(i);
        }
        System.out.println("Odd numbers in array.......");
        for (int i:a)
        {
            if (i%2!=0)
                System.out.println(i);
        }
    }

}
