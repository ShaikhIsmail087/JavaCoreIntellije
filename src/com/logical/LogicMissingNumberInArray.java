package com.logical;

import java.util.Arrays;

public class LogicMissingNumberInArray {
    public static int getMissingNumber(int[] a,int n)
    {
        int actualSum=0;
        int expectedSum=(n*(n+1)/2);
        for (int i:a)
        {
            actualSum+=i;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        //array should not have duplicates
        //Array no need to be sorted order
        //value should be in range
        int[] a={1,2,3,4,5,7,8,9,10};
        int missingNumber=getMissingNumber(a,10);
        System.out.printf("Missing number in array %s  is %d %n", Arrays.toString(a),missingNumber);
        //1+2+4+5=12 sum1
        //1+2+3+4+5=15 sum2
        //sum2-sum1=15-12=3 missing
        int sum1=0;
        for (int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println("sum of elements in array: "+sum1);

        int sum2=0;
        for (int i=1;i<=10;i++)
        {
            sum2=sum2+i;
        }
        System.out.println("sum of range of elements in array: "+sum2);
        System.out.println("Missing Number is :"+(sum2-sum1));
    }
}
