package com.java8features;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);
        Integer[] i3=l.stream().toArray(Integer[]::new);
        Stream.of(i3).forEach(System.out::println);
//        for(Integer i:i3)
//        {
//            System.out.println(i);
//        }
        System.out.println(l);
        Consumer<Integer> c=i->{
            System.out.println("The Square of "+i+" is:"+i*i);
        };
        l.forEach(c);
        System.out.println();
        l.forEach(System.out::println);
        System.out.println();
        Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("min:"+min);
        Integer max=l.stream().max(Integer::compareTo).get();
        System.out.println("max:"+max);
        Integer min1=l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println("min1:"+min1);
        Integer max1=l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println("max1:"+max1);
    }
}
