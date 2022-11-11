package com.logical;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] array={-6,-1,2,4,5};
        int[] squareArray=squareSortedArray(array);
        for (int i=0;i<squareArray.length;i++)
        {
            System.out.println(squareArray[i]);
        }
    }

    private static int[] squareSortedArray(int[] array) {
        int[] squareArray=new int[array.length];
        int start=0;
        int end= array.length-1;
        int squareIndex= array.length-1;
        while (start<=end)
        {
            if (array[start]*array[start]>array[end]*array[end])
            {
                squareArray[squareIndex--]=array[start]*array[start];
                start++;
            }
            else
            {
                squareArray[squareIndex--]=array[end]*array[end];
                end--;
            }
        }
        return squareArray;
    }
}
