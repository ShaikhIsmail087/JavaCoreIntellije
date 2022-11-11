package com.logical;

import java.util.Arrays;

public class LogicBinarySearch {
    private static int binarySearchEle(int[] a, int low, int high, int searchElement) {
        if (high>=low)
        {
            int mid=(high+low)/2;
            if (a[mid]==searchElement)
            {
                return mid;
            }
            if (searchElement>a[mid])
            {
                return binarySearchEle(a,mid+1,high,searchElement);
            }
            if (searchElement<a[mid])
            {
                return binarySearchEle(a,low,mid-1,searchElement);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};//should be in sorted order
        //Approach 1=Logic
        int searchElement=9;
        int index=binarySearchEle(a,0,a.length-1,searchElement);
        System.out.println("Element Found at index "+index);
        //Approach 2=Logic
        int key=7;
        int l=0;
        int h=a.length-1;
        boolean flag=false;
        while (l<=h)
        {
            int m=(l+h)/2;
            if (a[m]==key) //key should be equal to m value
            {
                System.out.println("Element Found...");
                flag=true;
                break;
            }
            if (a[m]<key)  //key should be greater than m value
            {
                l=m+1;
            }
            if (a[m]>key)  //key should be less than m value
            {
                h=m-1;
            }
        }
        if (flag==false)
        {
            System.out.println("Element Not found...");
        }
        //Approach 2 : Arrays.binarySearch()
        System.out.println(Arrays.binarySearch(a,10));
    }
}
