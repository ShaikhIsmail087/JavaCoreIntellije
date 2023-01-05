package com.logical;

public class RotateArrayElementsToLeftByNTimes {
    public static void main(String[] args) {

        int one='a'/'a';
        int ten="**********".length();
        for (int i=one;i<= 'd';i++)
        {
            System.out.print(i+" ");
        }

        System.out.println();
        int[] arr=new int[]{1,2,3,4,5};
        int n=3;
        for(int i=0;i<n;i++)
        {
            int first=arr[0],j;
            for(j=0;j< arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
