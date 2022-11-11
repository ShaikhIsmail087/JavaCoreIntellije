package com.company;

public class Array4 {
    public static int[] array()
    {
       return new int[]{10,20,30,40};
    }
    public static void main(String[] args) {
        int[] a=array();
        for (int i:a){
            System.out.println(i+" ");
        }
//        int[] a={1,2,3,4,5,6,7};
//        System.out.println(a.length);
//        System.out.println("an array on odd position:");
//        for (int i=0;i<a.length;i=i+2){
//            System.out.print(a[i]+" ");
//        }
    }
}
