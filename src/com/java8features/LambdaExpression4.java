package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpression4 {

    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(21);
        a.add(5);
        a.add(1);
        a.add(9);
        a.add(0);
        System.out.println(a);
        Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
        Collections.sort(a,c);
        System.out.println(a);
        a.stream().forEach(System.out::println);
//        List<Integer> l=a.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(l);
//        Runnable r=()->
//        {
//          for (int i=1;i<=10;i++){
//              System.out.println("Child thread-"+i);
//          }
//        };
//        Thread t=new Thread(r);
//        t.start();
//        for (int i=1;i<=10;i++){
//            System.out.println("Main thread-"+i);
//        }
//        Function<Integer,Integer> f=j->j*j;
//        System.out.println("The square of 40 : "+f.apply(40));
//        System.out.println("The square of 50 : "+f.apply(53));
//        Predicate<Integer> p= i->i%2==0;
//        System.out.println("The 40 is even: "+p.test(40));
//        System.out.println("The 53 is odd: "+p.test(53));
    }
}
