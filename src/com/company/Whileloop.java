package com.company;

public class Whileloop implements Cloneable{
    int id;
    String name;
    Whileloop(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "student id: "+id+" "+"student name: "+name;
    }
    public boolean equals(Object obj){
        try{
        Whileloop w=(Whileloop)obj;
        if(name.equals(w.name) && id==w.id) {
            return true;
        }
            else{
                return false;
            }
        }catch (Exception ex){
            return false;
        }
    }
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Whileloop w1=new Whileloop(101,"Ismail");
        Whileloop w2=new Whileloop(102,"Rashid");
        Whileloop w3=(Whileloop)w1.clone();
        System.out.println(w1.equals(w3));
        System.out.println(w2);
        System.out.println(w3);
    }
}
