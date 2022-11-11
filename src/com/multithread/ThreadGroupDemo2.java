package com.multithread;
class MyThread extends Thread
{
    public MyThread(ThreadGroup g,String name) {
        super(g,name);
    }

    @Override
    public void run() {
        System.out.println("Child Thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadGroupDemo2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup pg=new ThreadGroup("Parent Group");
        ThreadGroup cg=new ThreadGroup("Child Group");
        MyThread t1=new MyThread(pg,"Child Thread-1");
        MyThread t2=new MyThread(pg,"Child Thread-2");
        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
        Thread.sleep(5000);
        System.out.println(pg.activeCount());
        pg.list();
        cg.list();
        pg=null;cg=null;t1=null;t2=null;
    }
}
