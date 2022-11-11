package com.java8features;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0;
        System.out.println(p.test(10,30));
        System.out.println(p.test(17,30));
    }
}
