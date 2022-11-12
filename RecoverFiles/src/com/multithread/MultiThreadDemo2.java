package com.multithread;
class MyThread implements Runnable
{

	@Override
	public void run() {
		try {
		for(int i=1;i<=10;i++) {
				Thread.sleep(1000);
			System.out.println("Child thread: "+i);
		}
		}catch (Exception e) {
//			System.out.println("i got interuppted");
		}
	}
	
}
public class MultiThreadDemo2 {
public static void main(String[] args) {
	MyThread m1=new MyThread();
	Thread t1=new Thread();
	t1.start();
	Thread t2=new Thread(m1);
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("JAVA DEVOP");
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
	t2.setPriority(10);
	System.out.println(t2.getPriority());
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	t2.start();
//	try {
//		t2.interrupt();
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
	System.out.println("end of main Thread..");
	for(int i=1;i<=10;i++) {
		
		System.out.println("Main thread: "+i);
		
	}
}
}
