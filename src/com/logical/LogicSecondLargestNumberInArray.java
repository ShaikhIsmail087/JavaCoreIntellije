package com.logical;

import java.util.Arrays;
import java.util.Scanner;

public class LogicSecondLargestNumberInArray {
    public static void main(String[] args) {
       int[] a={10,300,5000,600,92,45,2700};
       int largest=a[0];
       int sec_largest=largest;
       for (int i=1;i<a.length;i++)
       {
           if (largest<a[i])
           {
               sec_largest=largest;
               largest=a[i];
           } else if (sec_largest<a[i]) {
               sec_largest=a[i];
           }
       }
        System.out.println("Largest element in the array: "+largest);
        System.out.println("Second largest element in the array: "+sec_largest);

        //Approach 2
        int[] array={1,20,5,6,16,10};
        Arrays.sort(array);
        System.out.println("Largest element in the array: "+array[array.length-1]);
        System.out.println("Second largest element in the array: "+array[array.length-2]);

        //Dynamic array
        //create scanner object for taking input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();      //Take the number of element and store it
        int[] array1=new int[size];     //create an array of size with size
        for(int i=0;i<array1.length;i++)
        {
            System.out.println("Enter the element:");
            array1[i]=sc.nextInt();
        }
        //Dynamic sum of array
        int sum=0;
        for(int i:array1)
        {
            sum=sum+i;
        }
        System.out.println("Printing the dynamic array:"+Arrays.toString(array1));
        Arrays.sort(array);
        System.out.println("largest element in array:"+array1[array1.length-1]);
        System.out.println("Second largest element in array:"+array1[array1.length-2]);
        System.out.println("Third largest element in array:"+array1[array1.length-3]);
        System.out.println("Total sum of array:"+sum);
    }
}
