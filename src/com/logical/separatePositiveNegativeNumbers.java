package com.logical;

public class separatePositiveNegativeNumbers {
    public static void main(String[] args) {
        int[] arr={9,10,-18,20,-27,30,-36,40,45,50};
        int[] positiveNumbersArray=new int[10];
        int[] negativeNumbersArray=new int[10];
        int positiveNumbersCount=0,negativeNumbersCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                negativeNumbersArray[negativeNumbersCount++]=arr[i];
            }
            else
            {
                positiveNumbersArray[positiveNumbersCount++]=arr[i];
            }
        }
        System.out.println("total positive numbers: "+positiveNumbersCount);
        System.out.println("total negative numbers: "+negativeNumbersCount);

        System.out.println("positive array elements: ");
        printArrayelements(positiveNumbersArray,positiveNumbersCount);

        System.out.println("negative array elements: ");
        printArrayelements(negativeNumbersArray,negativeNumbersCount);
    }
    public static void printArrayelements(int[] arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
