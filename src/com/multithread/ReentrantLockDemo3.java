package com.multithread;

import java.util.concurrent.locks.ReentrantLock;

class MyThread2 extends Thread
{
    static ReentrantLock l=new ReentrantLock();
    String name;

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (l.tryLock()) {//checking if thread got lock and performing op tryLock()
//            l.lock();
            System.out.println(Thread.currentThread().getName() + " Got lock and performing safe operations");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                l.unlock();
            }
        }
        else{
            System.out.println(Thread.currentThread().getName()+" Unable to get lock and Hence performing Alternative Operations");
        }
    }
}
public class ReentrantLockDemo3 {
    public static void main(String[] args) {
        MyThread2 t1=new MyThread2("First Thread");
        MyThread2 t2=new MyThread2("Second Thread");
        t1.start();
        t2.start();
    }
}
