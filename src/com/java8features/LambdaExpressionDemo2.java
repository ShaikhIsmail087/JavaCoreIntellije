package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1
{
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionDemo2 {
    public static void main(String[] args) {
        List<Product1> list=new ArrayList<Product1>();
        list.add(new Product1(1,"Samsung A5",17000f));
        list.add(new Product1(3,"Iphone 6S",65000f));
        list.add(new Product1(2,"Sony Xperia",25000f));
        list.add(new Product1(4,"Nokia Lumia",15000f));
        list.add(new Product1(5,"Redmi4 ",26000f));
        list.add(new Product1(6,"Lenevo Vibe",19000f));

        Stream<Product1> stream_data=list.stream().filter(p->p.price>20000);
        stream_data.forEach(product1 -> System.out.println(product1.price+" "+product1.name));
    }
}
