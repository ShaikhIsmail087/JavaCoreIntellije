package com.basic;

import java.lang.reflect.Method;

public class ObjectMethods {
public static void main(String[] args) throws ClassNotFoundException {
	
	Class c=Class.forName("java.lang.StringBuffer");
	Method[] m=c.getDeclaredMethods();
	int count=0;
	for (Method method : m) {
		count++;
		System.out.println(method);
	}
	System.out.println("Total methods available :"+count);
}
}
