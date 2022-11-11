package com.company;

public class Array2 {
    public static void sum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("array sum="+sum);
    }
    public static int[] m1(){
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5, 6, 7, 8, 9};
        sum(a);
       // int[] a =m1();
       // for (int i:a)
        //System.out.print(i+", ");
    }
}
