package com.company;

public class cwh_vararg_33 {
 //   static int sum(int a, int b){
 //       return a+b;
//    }
 //   static int sum(int a, int b,int c){
//        return a+b+c;
 //   }
//    static int sum(int a, int b,int c,int d){
//        return a+b+c+d;
//    }
    static int sum(int x,int ...arr){
        //Available as int[] arr;
        int result =x;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to vararg tutorial!");
     //   System.out.println("The sum of nothing :" + sum());
        System.out.println("The sum of 1 is :" + sum(1));
        System.out.println("The sum of 4, 3, and 5 :" + sum(4,3,5));
        System.out.println("The sum of 4,2 ,3, and 5 :" + sum(4, 2,3,5));
        System.out.println("The sum of 4, 1,2 ,3, and 5 :" + sum(4,1, 2,3,5));
    }
}
