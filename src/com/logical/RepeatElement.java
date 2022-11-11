package com.logical;

public class RepeatElement {
    public static void main(String[] args) {
        int[] a={1,5,1,5,4,2};
        int[] temp=new int[a.length];
        for(int i=0;i<temp.length;i++)
        {
            if(temp[a[i]]==1)
            {
                System.out.println(a[i]);
            }
            else
            {
                temp[a[i]]++;
            }
        }
    }
}
