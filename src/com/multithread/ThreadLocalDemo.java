package com.multithread;

public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal t=new ThreadLocal<>();
        System.out.println(t.get());
        t.set("Ismail");
        System.out.println(t.get());
        t.remove();
        System.out.println(t.get());

        //Overriding of initialValue()
        ThreadLocal t1=new ThreadLocal<>(){
            @Override
            protected Object initialValue() {
                return "abc";
            }
        };
        System.out.println(t1.get());
        t1.set("Ismail");
        System.out.println(t1.get());
        t1.remove();
        System.out.println(t1.get());
    }
}
