package com.java8features;
//class Sample
//{
//    public Sample(String s) {
//        System.out.println("Sample class Constructor Execution with argument:"+s);
//    }
//}
class Student1
{
    String name;
    int rollno;
    int marks;
    int age;

    public Student1(String name, int rollno, int marks, int age) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.age = age;
        System.out.println(this.name+" "+this.rollno+" "+this.marks+" "+this.age);
    }
}
interface interf1
{
   // public Sample get(String s);
    public Student1 get(String name,int rollno,int marks,int age);
}
public class LamdaExConstructorRef {
    public static void main(String[] args) {
//        interf1 i=Sample::new;
//        Sample s=i.get("Ismail");
//        Sample s1=i.get("Ahmed");
        interf1 i1=(name, rollno, marks, age) -> new Student1(name,rollno,marks,age);
        interf1 i2=Student1::new;//better approach constructor reference
        i2.get("ismail",1674,62,26);
    }
}
