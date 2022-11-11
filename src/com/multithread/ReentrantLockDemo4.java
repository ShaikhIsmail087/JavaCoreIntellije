package com.multithread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread3 extends Thread
{
    static ReentrantLock l=new ReentrantLock();
    String name;

    public MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        do{
        try {
            if (l.tryLock(1000, TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().getName() + " -----Got lock");
                Thread.sleep(5000);
                l.unlock();
                System.out.println(Thread.currentThread().getName() + " -------Releases lock");
                break;
            }else {
                System.out.println(Thread.currentThread().getName()+" --------Unable to get lock and will try again");
            }
        } catch (InterruptedException e) {}
        }
        while (true);
    }
}
public class ReentrantLockDemo4 {
    public static void main(String[] args) {
        MyThread3 t1=new MyThread3("First Thread");
        MyThread3 t2=new MyThread3("Second Thread");
        t1.start();
        t2.start();
    }
}
