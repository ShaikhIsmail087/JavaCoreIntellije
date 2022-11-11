package com.java8features;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee3
{
    int eno;
    String name;

    public Employee3(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }
}
public class BiFunctionDemo {
    public static void main(String[] args) {
        ArrayList<Employee3> l=new ArrayList<>();
        BiFunction<Integer,String,Employee3> f=(eno,name)->new Employee3(eno,name);
        l.add(f.apply(100,"Durga"));
        l.add(f.apply(200,"Ravi"));
        l.add(f.apply(300,"Shiva"));
        l.add(f.apply(400,"Pavan"));
        for (Employee3 e:l)
        {
            System.out.println("Employee Number:"+e.eno);
            System.out.println("Employee Name:"+e.name);
            System.out.println();
        }
    }
}
