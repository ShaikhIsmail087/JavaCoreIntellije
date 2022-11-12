package com.java8features;

import java.util.function.BiFunction;

interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
class Arithmetic
{
	public int add(int a,int b) 
	{
		return a+b;
	}
}
interface Sayable
{
	void say();
	public static int add(int a,int b) 
	{
		return a+b;
	}
}
public class MethodReference {
	public static void saySomthing() 
	{
		System.out.println("Hello,this is static method");
	}
	public void say() 
	{
		System.out.println("Hello,this is instance method");
	}
	public static void threadStatus() 
	{
		System.out.println("Thread is running....");
	}
	public void printMsg() 
	{
		System.out.println("Hello, this is instance method");
	}
	public static void main(String[] args) {
		//static method reference
		Sayable s=MethodReference::saySomthing;
		s.say();
		
		Thread t=new Thread(MethodReference::threadStatus);
		t.start();
		
		BiFunction<Integer, Integer, Integer> adder=Sayable::add;
		int result=adder.apply(100, 200);
		System.out.println(result);
		
		//instance method reference
		MethodReference methodreference=new MethodReference();//by ref object
		Sayable s2=methodreference::say;
		s2.say();
		
		Sayable s3=new MethodReference()::say;//by anonymous
		s3.say();
		
		Thread t2=new Thread(new MethodReference()::printMsg);
		t2.start();
		
		BiFunction<Integer, Integer, Integer> adder2=new Arithmetic()::add;
		int result2=adder2.apply(200, 300);
		System.out.println(result2);
		
		//constructor reference
		Messageable hello=Message::new;
		hello.getMessage("Hello World");
	}
}
