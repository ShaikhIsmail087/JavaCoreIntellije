package com.company;

public class cwh_32_method_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static  void  tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }

    public static void main(String[] args) {
        //tellJoke();
        //case 1: changing the integer
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after change is : " + x);

        //case 1: changing the Array
        //int [] marks = {52,73,77,98,99,89};
        //change2(marks);
        //System.out.println("The value of x after change is : " + marks[0]);

        //Method overloading
        foo();
        foo(3000);
        foo(3000,4000); //Arguments
    }
}
