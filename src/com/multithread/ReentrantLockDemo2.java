package com.multithread;

import java.util.concurrent.locks.ReentrantLock;

class Display
{
    ReentrantLock l=new ReentrantLock(true);
    public void wish(String name)
    {
        l.lock();
        for (int i=0;i<5;i++) {
            System.out.println("Good Morning:"+i);
            try {
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println(name);
        }
        l.unlock();
    }
}
class MyThread1 extends Thread
{
    Display d;
    String name;

    public MyThread1(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class ReentrantLockDemo2 {
    public static void main(String[] args) {
        Display d=new Display();
        MyThread1 t1=new MyThread1(d,"Dhoni");
        MyThread1 t2=new MyThread1(d,"YuvRaj");
        MyThread1 t3=new MyThread1(d,"Raina");
        t1.start();
        t2.start();
        t3.start();
    }
}
