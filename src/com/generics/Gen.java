package com.generics;
class MyGenerics<T>
{
   T obj;

    public MyGenerics(T obj) {
        this.obj = obj;
    }
    public void show()
    {
        System.out.println("The type of ob:"+ obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}
public class Gen {
    public static void main(String[] args) {
        MyGenerics<String> g1=new MyGenerics<>("Ismail");
        g1.show();
        System.out.println(g1.getObj());

        MyGenerics<Integer> g2=new MyGenerics<>(50);
        g2.show();
        System.out.println(g2.getObj());

        MyGenerics<Double> g3=new MyGenerics<>(65.43);
        g3.show();
        System.out.println(g3.getObj());
    }
}
