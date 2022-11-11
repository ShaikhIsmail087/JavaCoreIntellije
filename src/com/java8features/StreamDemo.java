package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<Integer> s=Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);
        System.out.println();

        Integer[] i1={10,20,30,40,50};
        Stream.of(i1).forEach(System.out::println);
        System.out.println();

        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        System.out.println(l);
        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> l3=l.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(l3);
    }
}
