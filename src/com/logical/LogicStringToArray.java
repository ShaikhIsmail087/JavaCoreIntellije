package com.logical;

import java.util.Arrays;

public class LogicStringToArray {
    public static void main(String[] args) {
        String[] str={"178","751","254","963","234"};
        int[] newArray=new int[str.length];
        int temp=0;
        System.out.println("Original String Array:"+ Arrays.toString(str));
        for(int i=0;i<str.length;i++)
        {
            int sum=0;
            for(int j=0;j<str[i].length();j++)
            {
                sum +=Integer.parseInt(String.valueOf(str[i].charAt(j)));
            }
            newArray[i]=sum;
        }
        System.out.println("Addition of String element:"+Arrays.toString(newArray));
        //sorting an array by in built method of Arrays class
        Arrays.sort(newArray);
        System.out.println("Sorting an array:"+Arrays.toString(newArray));
        //Normal way of sorting an array by nested for loop
        for (int i=0;i<newArray.length;i++)
        {
            for (int j=i+1;j<newArray.length;j++)
            {
                if (newArray[i]>newArray[j])
                {
                    temp=newArray[i];
                    newArray[i]=newArray[j];
                    newArray[j]=temp;
                }
            }
        }
        System.out.println("Sorting an array:"+ Arrays.toString(newArray));
    }
}
