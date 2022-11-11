package com.java8features;

import java.util.function.Consumer;

class Movie
{
 String name;

    public Movie(String name) {
        this.name = name;
    }
}
public class ConsumerFIDemo {
    public static void main(String[] args) {
        Consumer<Movie> c1=m-> System.out.println(m.name+" ready to release");
        Consumer<Movie> c2=m-> System.out.println(m.name+" release but it is bigger flop");
        Consumer<Movie> c3=m-> System.out.println(m.name+" storing information in database");
        Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
        Movie m=new Movie("Spider");
        cc.accept(m);
    }
}
