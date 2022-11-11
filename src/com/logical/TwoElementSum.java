package com.logical;

public class TwoElementSum {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int sum=50;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]==sum-a[i])
                {
                    System.out.println(a[i]+","+a[j]);
                }
            }
        }
    }
}
