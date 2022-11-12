package com.multithread;
class ThreadB extends Thread
{
	int total =0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calculation");
			for(int i=0;i<=100;i++) {
				total+=i;
			}
			System.out.println("child thread giving notification call");
			this.notify();
		}
	}
	
}
public class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("main thread calling wait() method");
			b.wait(2000);
			System.out.println("main thread got notification call");
			System.out.println(b.total);
		}
	}
}
