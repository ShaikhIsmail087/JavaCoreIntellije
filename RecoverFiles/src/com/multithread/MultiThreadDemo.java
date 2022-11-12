package com.multithread;

class MultiThreadingDemo extends Thread implements Runnable
{
	public void run() 
	{
		for (int i = 0; i < 11; i++) {
			try {
				Thread.yield();
			} catch (Exception e) {}
			System.out.println("child thread: "+i);
		}
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		MultiThreadingDemo m=new MultiThreadingDemo();
		Thread t2=new Thread(m);
		System.out.println(t2.currentThread().getName());
		t2.start();
		Thread t3=new Thread(m);
		System.out.println(m.currentThread().getName());
		Thread.currentThread().setName("Ismail");
		System.out.println(t3.currentThread().getName());
		t2.setPriority(10);
		t3.start();
		for(int i=0;i<11;i++) 
		{
			try {
				Thread.yield();
			} catch (Exception e) {}
			System.out.println("main thread: "+i);
		}
	}

}
/*Thread Class vs Runnable Interface 

If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance.
But, if we implement the Runnable interface, our class can still extend other base classes.
We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc.
that are not available in Runnable interface.
Using runnable will give you an object that can be shared amongst multiple threads. */