package com.multithread;
class MyThread2 extends Thread
{
	MyThread2 t;
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("lazy Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class DaemonThreadDemo {
	public static void main(String[] args) {
		MyThread2 t1=new MyThread2();
		t1.setDaemon(true);
		t1.start();
		System.out.println("end of main thread");
//		System.out.println(Thread.currentThread().isDaemon());
//		MyThread2 t=new MyThread2();
//		System.out.println(t.isDaemon());
//		t.start();
//		t.setDaemon(true);
//		System.out.println(t.isDaemon());
	}
}
