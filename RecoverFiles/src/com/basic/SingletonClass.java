package com.basic;

public class SingletonClass {
	private static SingletonClass instance;
	
	private SingletonClass() {
		System.out.println("Singletonclass : 0-arg Con");
	}
	public static SingletonClass getInstance() 
	{
		if(instance==null) 
			instance=new SingletonClass();
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}
	public void called() 
	{
		System.out.println("The nornmal method will be called");
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonClass s1=SingletonClass.getInstance();
		System.out.println("Hashcode of s1 object:"+s1.hashCode());
		s1.called();
		System.out.println();
		SingletonClass s2=s1.getInstance();
		System.out.println("Hashcode of s1 object:"+s2.hashCode());
		s2.called();
		System.out.println();
		SingletonClass s3=(SingletonClass)s1.clone();
		System.out.println("Hashcode of s1 object:"+s3.hashCode());
		s3.called();
	}
}
