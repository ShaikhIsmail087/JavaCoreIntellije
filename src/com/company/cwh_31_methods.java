package com.company;

public class cwh_31_methods {
    static  void  tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }
    static int logic(int x,int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x + y) *5;
        }
        x=544;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b =  7;
        int c;
       //method invocation using object creation
        // cwh_31_methods obj = new cwh_31_methods();
        //c = obj.logic(a , b);
        c = logic(a , b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1 , b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
