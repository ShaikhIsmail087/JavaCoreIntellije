package com.collectionframwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Student
{
	int rollno;
	String name;
}
public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<>();
	l.add(17);
	l.add(2);
	l.add(15);
	l.add(1);
	l.add(7);
	l.add(6);
	l.add(8);
	System.out.println(l);
//	List<Integer>l1=l.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).toList();
	System.out.println("Reverse list:");
	List<Integer> l1=l.stream().sorted((i1,i2)->i2.compareTo(i1)).toList();
	l1.forEach(System.out::println);
	System.out.println("Filtering even number:");
	l1.stream().filter(i->i%2==0).forEach(System.out::println);
	System.out.println("Filtering odd number:");
	l1.stream().filter(i->i%2!=0).forEach(System.out::println);
	Stream.of(l1).forEach(System.out::println);
//	for (Integer integer : l1) {
//		System.out.println(integer);
//	}
	}
}
