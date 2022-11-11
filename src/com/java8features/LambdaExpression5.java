package com.java8features;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
    String name;
    int eno;

    public Employee(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }

    @Override
    public String toString() {
        return eno+":"+name;
    }
}
public class LambdaExpression5 {
    public static void main(String[] args) {
        ArrayList<Employee> l=new ArrayList<>();
        l.add(new Employee("Durga",872425));
        l.add(new Employee("Sunny",212345));
        l.add(new Employee("Bunny",111213));
        l.add(new Employee("Chinny",434343));
        l.add(new Employee("Vinny",424345));
        System.out.println(l);
       Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
//        Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println(l);
    }
}
