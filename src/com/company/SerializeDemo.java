package com.company;

import java.io.*;

class Dog implements Serializable
{
    String userName="Ismail Shaikh";
    transient String pwd="Ismail@123";

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        String ePwd="123"+pwd;
        os.writeObject(ePwd);
    }
    private void readObject(ObjectInputStream oi) throws IOException, ClassNotFoundException {
        oi.defaultReadObject();
        String ePwd= (String) oi.readObject();
        pwd=ePwd.substring(3);
    }
}
public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d1=new Dog();
        System.out.println(d1.userName+" "+d1.pwd);
//        System.out.println("Serialization started");
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
//        System.out.println("object Serialized");
//        System.out.println("Deserialization started");
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();
//        System.out.println("object Deserialized");
        System.out.println(d2.userName+" "+d2.pwd);

    }
}
