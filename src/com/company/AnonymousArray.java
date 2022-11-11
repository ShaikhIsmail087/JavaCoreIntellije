package com.company;

public class AnonymousArray {
    public static int[] printingAnonymousArray()
    {
        return new int[]{10,20,30,40};
    }
    public static void printingAnonymousArray1(int[] a)
    {
        System.out.println("Original Array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nReverse Array:");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        printingAnonymousArray1(new int[]{10,20,30,40});
        int[] a=printingAnonymousArray();
        System.out.println("Original Array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nReverse Array:");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
