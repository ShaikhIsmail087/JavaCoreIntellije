package com.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //converting Array to Arraylist 1)Arrays.asList()
        String[] s={"Java","C","C++","Java Framework"};
        List<String> l=Arrays.asList(s);
        System.out.println(l);

        //2)Collections.addAll(list,array elements)
        List<String> l1=new ArrayList<>();
        Collections.addAll(l1,s);
        System.out.println(l1);

        //3)l1.add(s)
        for (String str:s)
        {
            l1.add(str);
        }
        System.out.println(l1);
        System.out.println(Arrays.asList(s));
        System.out.println(Arrays.deepToString(s));
        Arrays.asList(s).forEach(System.out::println);
        Arrays.stream(s).forEach(System.out::println);

        //Largest & Smallest element in array
        int[] array=new int[]{1,100,20,30,50};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int number:array)
        {
            if (number>largest)
            {
                largest=number;
            } if (number<smallest) {
                smallest=number;
            }
        }
        System.out.println("Largest number in array: "+largest);
        System.out.println("Smallest number in array: "+smallest);
    }
}
