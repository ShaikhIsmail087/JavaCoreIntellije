package com.multithread;
class ParentThread extends Thread
{
	//static ThreadLocal tl=new ThreadLocal();//pp & null 
	//static InheritableThreadLocal tl=new InheritableThreadLocal(); //pp & pp
	static InheritableThreadLocal tl=new InheritableThreadLocal() //pp & cc
	{
		public Object childValue(Object p) {
			return "CC";
			
		}
	};
	public void run() {
		tl.set("PP");
		System.out.println("parent Thread value:----- "+tl.get());
		ChildThread ct=new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread
{
	public void run() {
		System.out.println("Child Thread value:------ "+ParentThread.tl.get());
	}
}
public class ThreadLocalDemo {
public static void main(String[] args) {
	ParentThread pt=new ParentThread();
	pt.start();
	
}
}
