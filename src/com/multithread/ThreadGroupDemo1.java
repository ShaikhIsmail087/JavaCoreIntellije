package com.multithread;

public class ThreadGroupDemo1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        Thread t=new Thread();
        System.out.println(Thread.currentThread().getName());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setPriority(10);
        System.out.println(t.getPriority());
        ThreadGroup pg=new ThreadGroup("Parent Group");
        pg.setMaxPriority(10);
        System.out.println(pg.getMaxPriority());
        System.out.println(pg.getParent().getName());
        ThreadGroup cg=new ThreadGroup(pg,"Child Group");
        System.out.println(cg.getParent().getName());

        Thread t1=new Thread(pg,"Thread-1");
        System.out.println(t1.getName());
        Thread t2=new Thread(pg,"Thread-2");
        System.out.println(t2.getName());
        pg.setMaxPriority(4);
        Thread t3=new Thread(pg,"Thread-3");
        System.out.println(t3.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}
