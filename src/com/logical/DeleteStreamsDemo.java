package com.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DeleteStreamsDemo {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        System.out.println("Original Array: "+ Arrays.toString(numbers));
        int index=1;
        int[] newArray=IntStream.range(0,numbers.length).filter(i->i!=index).map(i->numbers[i]).toArray();
        System.out.println("New Array After Deletion: "+Arrays.toString(newArray));

        //Delete an element af an array through collection
        String[] stringArray={"Red","Green","Blue"};
        List<String>stringList=new ArrayList<>(Arrays.asList(stringArray));
        stringList.remove(2);
        stringList.remove("Black");
        System.out.println(stringList);

        //Delete element from an Array
        int[] firstArray={1,2,3,4,5};
        System.out.println("Original Array: "+ Arrays.toString(numbers));
        int index1=2;
        int[] newArray1=new int[firstArray.length-1];
        for (int i=0,k=0;i<firstArray.length;i++)
        {
            if (i==index1)
            {
                continue;
            }
            newArray1[k++]=firstArray[i];
        }
        System.out.println("New Array After Deletion: "+Arrays.toString(newArray1));
    }
}
