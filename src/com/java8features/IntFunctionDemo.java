package com.java8features;

import java.util.function.*;

public class IntFunctionDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=i->i*i;
        System.out.println(f1.apply(4));

        IntFunction<Integer> f2=i->i*i;
        System.out.println(f2.apply(5));

        Function<String,Integer> f3=s->s.length();
        System.out.println(f3.apply("IsmailShaikh"));

        ToIntFunction<String> f4=s->s.length();
        System.out.println(f4.applyAsInt("WelcomeToJava"));

        Function<Integer,Double> f5=i->Math.sqrt(i);
        System.out.println(f5.apply(7));

        IntToDoubleFunction f6=i->Math.sqrt(i);
        System.out.println(f6.applyAsDouble(9));

        UnaryOperator<Integer> o=i->i*i;
        System.out.println(o.apply(45));

        IntUnaryOperator o1=i->i*i;
        System.out.println(o1.applyAsInt(8));

        BiFunction<String,String,String> b=(s1,s2)->s1+s2;
        System.out.println(b.apply("Durga","Software"));

        BinaryOperator<String> b1=(s1,s2)->s1+s2;
        System.out.println(b1.apply("Ismail","Shaikh"));

        BinaryOperator<Integer> b2=(i1,i2)->i1*i2;
        System.out.println(b2.apply(3,5));

        IntBinaryOperator b3=(i1,i2)->i1*i2;
        System.out.println(b3.applyAsInt(8,5));

        IntUnaryOperator u=i->i+1;
        System.out.println(u.applyAsInt(4));

        IntUnaryOperator u1=i->i*i;
        System.out.println(u1.applyAsInt(4));
        System.out.println(u.andThen(u1).applyAsInt(4));
    }
}
