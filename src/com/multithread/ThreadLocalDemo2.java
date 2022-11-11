package com.multithread;
class CustomerThread extends Thread
{
    static Integer custId=0;
    private static ThreadLocal t1=new ThreadLocal()
    {
        @Override
        protected Object initialValue() {
            return ++custId;
        }
    };

    public CustomerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
//        for (int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() + " executing with Customer id :" + t1.get());
//        }
//        System.out.println();
    }
}
public class ThreadLocalDemo2 {
    public static void main(String[] args) {
        CustomerThread c1=new CustomerThread("Customer Thread-1");
        CustomerThread c2=new CustomerThread("Customer Thread-2");
        CustomerThread c3=new CustomerThread("Customer Thread-3");
        CustomerThread c4=new CustomerThread("Customer Thread-4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
