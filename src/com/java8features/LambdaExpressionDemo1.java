package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product
{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionDemo1 {
    public static void main(String[] args) {
        List<Product> l=new ArrayList<>();
        l.add(new Product(1,"HP Laptop",25000));
        l.add(new Product(3,"Keyboard",300));
        l.add(new Product(2,"Dell Mouse",150));

        System.out.println("sorting on the basis of name");
        Collections.sort(l, Comparator.comparing(p -> p.name));
        for (Product p:l) {
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
}
