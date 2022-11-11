package com.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //by stream API java 8
        List<String> strings= Arrays.asList("ab","aba","xyx","mno","xyz","pop");
        strings.stream().filter(x->x.length()>0 && x.endsWith(String.valueOf(x.charAt(0)))).forEach(System.out::println);

        List<Integer> numbers=Arrays.asList(0,1,1,0,1,0,1,1,1,0,0);
        Integer sum=numbers.stream().reduce(0,Integer::sum);
        System.out.println("Numbers of 1s are ="+sum);
        System.out.println("Numbers of 0s are ="+(numbers.size()-sum));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size=sc.nextInt();
        int[] array=new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter the element:");
            array[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Printing the elements in an array");
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
