package com.multithread;
class ParentThread extends Thread
{
    public static InheritableThreadLocal t1=new InheritableThreadLocal<>(){
        @Override
        protected Object childValue(Object parentValue) {
            return "CC";
        }
    };
    @Override
    public void run() {
        t1.set("PP");
        System.out.println("Parent Thread :"+t1.get());
        ChildThread c=new ChildThread();
        c.start();
    }
}
class ChildThread extends Thread
{
    @Override
    public void run() {
        System.out.println("Child Thread :"+ParentThread.t1.get());
    }
}
public class ThreadLocalDemo3 {
    public static void main(String[] args) {
        ParentThread p=new ParentThread();
        p.start();
    }
}
