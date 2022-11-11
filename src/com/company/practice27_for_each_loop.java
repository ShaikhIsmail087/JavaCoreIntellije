package com.company;

public class practice27_for_each_loop {
    public static void main(String[] args) {
        /*
       float [] marks = {98.5f,45.5f,79.5f,99.5f,88.5f};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        String [] students ={"Harry","Shubham","Rohan","Lovish"};
        System.out.println(students.length);
        System.out.println(students[0]);

       */

        int [] marks ={98,45,79,99,88};
        System.out.println(marks.length);
        // displaying the array (naive way)
        System.out.println("printing using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // displaying the array (For loop)
        System.out.println("printing using for loop");
        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
        //Quick quiz displaying the array in reverse order(For loop)
        System.out.println("printing using for loop in reverse order");
        for(int i=marks.length-1;i>=0;i--) {
            System.out.println(marks[i]);
        }
        // displaying the array (For-each loop)
        System.out.println("printing array in for-each loop");
        for (int element: marks){
            System.out.println(element);
        }
    }
}
