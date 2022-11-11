package com.java8features;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee4
{
    String name;
    double salary;

    public Employee4(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class BiConsumerDemo {
    public static void populate(ArrayList<Employee4> l)
    {
        l.add(new Employee4("Durga",1000));
        l.add(new Employee4("Sunny",2000));
        l.add(new Employee4("Bunny",3000));
        l.add(new Employee4("Chinny",4000));
    }
    public static void main(String[] args) {
        ArrayList<Employee4> l=new ArrayList<Employee4>();
        populate(l);
        BiConsumer<Employee4,Double> c=(e,d)->e.salary=e.salary+d;
        for (Employee4 e:l)
        {
            c.accept(e,500.0);
        }
        for (Employee4 e:l)
        {
            System.out.println("Employee Name:"+e.name);
            System.out.println("Employee Salary:"+e.salary);
            System.out.println();
        }
    }
}
