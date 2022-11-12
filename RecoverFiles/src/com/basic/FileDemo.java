package com.basic;

import java.io.*;

public class FileDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Dog d=new Dog();
	System.out.println("Serialization started");
    FileOutputStream fos=new FileOutputStream("ismail.txt");
    ObjectOutputStream b=new ObjectOutputStream(fos);
    b.writeObject(d);
    System.out.println("Serialization ended");
    System.out.println("Deserialization started");
    FileInputStream fis=new FileInputStream("ismail.txt");
    ObjectInputStream o=new ObjectInputStream(fis);
    Dog d1=(Dog)o.readObject();
    System.out.println("Deserialization Ended");
    System.out.println(d1.i+"------"+d1.name+"------"+d1.i2);
}
}
class Dog implements Serializable
{
	int i=10;
	transient String name="bulldog";
	int i2=20;
}