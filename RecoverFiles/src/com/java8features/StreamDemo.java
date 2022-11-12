package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream<Integer> s=Stream.of(1,12,123,1234);
		s.forEach(System.out::println);
		
		System.out.println();
		Integer[] I= {10,0,15,5,20};
		Stream.of(I).forEach(System.out::println);
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(20);
		l.add(5);
		System.out.println(l);
		List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		List<Integer> l2=l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l2);
	}
}
