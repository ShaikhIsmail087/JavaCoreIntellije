package com.logical;

import java.util.Scanner;

public class CopyAnArrayWithRepeatation {
    public static void main(String[] args) {
        int[] origArray={1,2,3,4};
        System.out.println("Original Array:");
        for (int i=0;i<origArray.length;i++)
        {
            System.out.print(origArray[i]+" "); //1 2 3 4
        }
        int[] newArray=new int[origArray.length*2];
        int cnt=0;
        int cnt2=0;
        for (int i=0;i<origArray.length;i++)
        {
            newArray[cnt2]=origArray[i];
            if (i==origArray.length-1 && cnt==0)
            {
                cnt=1;
                i=-1;
            }
            cnt2++;
        }
        System.out.println();
        System.out.println("New Array:");
        for (int i=0;i<newArray.length;i++)
        {
            System.out.print(newArray[i]+" "); //1 2 3 4 1 2 3 4
        }

        //Find Second largest and smallest element in array
        /*int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array(Minimum 2):");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[n-2]);
        System.out.println("Smallest:"+a[0]);*/
    }
}
