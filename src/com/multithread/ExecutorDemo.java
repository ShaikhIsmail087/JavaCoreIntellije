package com.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable
{
    String name;
    public PrintJob(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name+"....Job Started By Thread:"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        System.out.println(name+"....Job Completed By Thread:"+Thread.currentThread().getName());
    }
}
public class ExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs={new PrintJob("Durga"),new PrintJob("Ravi"),new PrintJob("Nagendra"),
                        new PrintJob("Pavan"),new PrintJob("Bhaskar"),new PrintJob("Varma")};
        ExecutorService service= Executors.newFixedThreadPool(3);
        for (PrintJob job:jobs){
            service.submit(job);
        }
        service.shutdown();
    }
}
