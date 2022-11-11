package com.java8features;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class IntPredicateDemo {
    public static void main(String[] args) {
        int[] x={0,5,10,15,20,25,30,40};
        Predicate<Integer> p1= i->i%2==0;//aoutoboxing and aoutounboxing is happening performance will be down
        long start=System.currentTimeMillis();
        for (int a1:x)
        {
            if (p1.test(a1))
            {
                System.out.println(a1);
            }
        }
        System.out.println("The time taken by Predicate "+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        int[] a={0,5,10,15,20,25,30,40};
        IntPredicate p=i->i%2==0;//no aoutoboxing and no aoutounboxing performance is high
        for (int a1:a)
        {
            if (p.test(a1))
            {
                System.out.println(a1);
            }
        }
        System.out.println("The time taken by IntPredicate "+(System.currentTimeMillis()-start));
    }
}
