package com.logical;

import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={3,4,5};
        System.out.println("Common Elements:");
        for (int i=0;i<array1.length;i++)
        {
            for (int j=0;j<array2.length;j++)
            {
                if (array1[i]==array2[j])
                {
                    System.out.println(array1[i]);
                }
            }
        }
        //missing element in array
        int[] a={100,1,4,3,60,70,20};
        Arrays.sort(a);
        int cnt=0;
        System.out.println("sorted array: "+Arrays.toString(a));
        System.out.println("Missing numbers");
        for (int i=0;i<a.length;i++)
        {
            if (i==a.length-1)
                break;
            for(int j=a[i]+1;j<a[i+1];j++)
            {
                cnt++;
                System.out.println(j+" ");
                if(cnt==10)
                {
                    System.out.println();
                    cnt=0;
                }
            }
            cnt=0;
        }
    }
}
