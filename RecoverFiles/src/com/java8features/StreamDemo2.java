package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(75);
		l.add(65);
		l.add(28);
		l.add(32);
		l.add(50);
		l.add(25);
		l.add(45);
		System.out.println(l);
		
		Integer[] I=l.stream().toArray(Integer[]::new);
		Stream.of(I).forEach(System.out::println);
		
		System.out.println();
		List<Integer> soretedList=l.stream().sorted((i1,i2)->i1.compareTo(i2)).toList();
		System.out.println("soretedList:"+soretedList);
		
		Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("max:"+max);
		
		Integer min=l.stream().min(Integer::compareTo).get();
		System.out.println("min:"+min);
		
		System.out.println();
		long noOfFailedStudents=l.stream().filter(l1->l1<35).count();
		System.out.println("noOfFailedStudents:"+noOfFailedStudents);
		
		List<Integer> reverseList=l.stream().sorted((i1,i2)->i2.compareTo(i1)).toList();
		System.out.println("reverseList:"+reverseList);
		
		Integer max1=l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("max1:"+max1);
		
		Integer min1=l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("min1:"+min1);
	}
}
