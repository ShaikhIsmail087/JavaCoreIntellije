package com.collectionframwork;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
class Student1
{
	int rollno;
	String name;
	public Student1(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Student1> l=new LinkedList<>();
		l.add(new Student1(104, "Ismail"));
		l.add(new Student1(101, "Kalam"));
		l.add(new Student1(103, "Rashid"));
		l.add(new Student1(102, "Ahmed"));
		l.add(new Student1(105, "Siraj"));
		System.out.println(l);
		Comparator<Student1> c=(s1,s2)->{
			String i1=s1.toString();
			String i2=s2.toString();
			return -i1.compareTo(i2);
		};
		List<Student1> l1=l.stream().sorted(c).toList();
		System.out.println("traversing rollno:");
		l1.stream().forEach(System.out::println);
	}
}
