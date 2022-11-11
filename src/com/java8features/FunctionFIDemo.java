package com.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class FunctionFIDemo {
    public static void main(String[] args) {
        Function<Student,String> f=s->{
            int marks=s.marks;
            String grade="";
          if (marks>=80) grade="A[Dictinction]";
          else if (marks>=60) grade="B[First Class]";
          else if (marks>=50) grade="C[Second Class]";
          else if (marks>=35) grade="D[Third Class]";
          else  grade="E[Failed]";
          return grade;
        };
        Predicate<Student> p=s->s.marks>=60;
        Student[] s={new Student("Durga",100),
                     new Student("Sunny",65),
                     new Student("Bunny",55),
                     new Student("Chinny",45),
                     new Student("Vinny",25)};
        for (Student s1:s)
        {
            if (p.test(s1)) {
                System.out.println("Student Name:" + s1.name);
                System.out.println("Student Marks:" + s1.marks);
                System.out.println("Student Grade:" + f.apply(s1));
                System.out.println();
            }
        }
//        Function<Integer,Integer> f=i->i*i;
//        Function<String,String> f1=s -> s.toUpperCase();
//        System.out.println(f1.apply("IsmailShaikh"));
//        System.out.println("The square of 4->"+f.apply(4));
//        System.out.println("The square of 9->"+f.apply(9));
    }
}
