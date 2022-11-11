package com.java8features;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionFIDemo2 {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=i->2*i;
        Function<Integer,Integer> f2=i->i*i*i;
        System.out.println(f1.andThen(f2).apply(2));//andThen()we can take multiple time
        System.out.println(f1.compose(f2).apply(2));

        Consumer<String> c=s-> System.out.println(s);
        c.accept("Ismail Shaikh");//return type void
        c.accept("DurgaSolution");
    }
}
