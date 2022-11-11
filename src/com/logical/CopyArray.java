package com.logical;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        //creating & initializing old array
        int[] oldArray={10,20,30,40};
        //creating new array of size with old array
        int[] newArray=Arrays.copyOf(oldArray,oldArray.length);
        int[] newArray1=new int[oldArray.length];
        System.out.println("New Array:");
        for (int i:newArray)
        {
            System.out.println(i);
        }
        //loop through the old array and copy the elements in to the enw array
        System.out.println("New Array-1:");
        for (int i=0;i<newArray1.length;i++)
        {
            newArray1[i]=oldArray[i];
        }
        //loop through the new array after copying
        for (int i:newArray)
        {
            System.out.println(i);
        }
    }
}
