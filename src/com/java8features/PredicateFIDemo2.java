package com.java8features;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1
{
    String name;
    double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class PredicateFIDemo2 {
    public static void main(String[] args) {
        ArrayList<Employee1> a=new ArrayList<>();
        a.add(new Employee1("Durga",1000));
        a.add(new Employee1("Ravi",2000));
        a.add(new Employee1("Shiva",3000));
        a.add(new Employee1("Mahesh",4000));
        a.add(new Employee1("Adarsh",5000));
        a.add(new Employee1("Sagar",6000));

        Predicate<Employee1> p=e->e.salary>3000;
        for (Employee1 e1:a)
        {
            if (p.test(e1))
            {
                System.out.println(e1.name+":"+e1.salary);
            }
        }
        System.out.println();
        int[] x={0,5,10,15,20,25,30,35};
        Predicate<Integer> p1=i->i%2==0;
        Predicate<Integer> p2=i->i>10;
        //and(),or(),negate()
        //System.out.println("The number which are even and > 10");
        System.out.println("The number which are even");
        for (int x1:x)
        {
            if (p1.negate().test(x1))
            {
                System.out.println(x1);
            }
        }
    }
}
