package com.logical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LogicSortingElements {
    public static void main(String[] args) {
        //Approach 1
        /*int[] a={30,50,20,10,60};
        System.out.println("Array elements before sorting:"+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Array elements After sorting:"+ Arrays.toString(a));*/

        //Approach 2
        /*int[] a={30,50,20,10,60};
        System.out.println("Array elements before sorting:"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array elements After sorting:"+ Arrays.toString(a));*/

        //Reverse descending order
        Integer[] a={30,50,20,10,60};
        System.out.println("Array elements before sorting:"+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Array elements After sorting:"+ Arrays.toString(a));

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        String[] names=new String[size];
        System.out.println("Enter the elements:");
        String temp="";
        for(int i=0;i<names.length;i++)
        {
            names[i]=sc.next();
        }
        System.out.println("Original Element in array:");
        for(String name:names)
        {
            System.out.print(name+" ");
        }
        for(int i=0;i<names.length;i++)
        {
            for(int j=i+1;j<names.length;j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        System.out.println("\nSorted Element in array:");
        for(String name:names)
        {
            System.out.print(name+" ");
        }*/
    }
}
