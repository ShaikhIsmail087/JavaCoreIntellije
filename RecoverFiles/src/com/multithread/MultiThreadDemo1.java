package com.multithread;
public class MultiThreadDemo1 {
public static void main(String[] args) throws InterruptedException {
	MyThread11 t1=new MyThread11();
	MyThread11 t2=new MyThread11();
	t1.start();
	t2.start();
	for(int i=1;i<=10;i++) {
//		Thread.sleep(1000);
		System.out.println("Lailaha ilaha illalahu muhammadur rasullulah");
	}
}
}
class MyThread11 extends Thread
{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("AllahuAkber");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	
}