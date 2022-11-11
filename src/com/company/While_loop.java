package com.company;

public class While_loop {
    public static void main(String[] args) {
//        condition check
//        System.out.println("While loop:");
//        int a = 0;
//        while (a<5){
//            System.out.println(a);
//            a++;
//        }
//        System.out.println("While loop stop!");
//       without condition check
        int b =1;
        do {
            if (b==5) {
                b++;
                continue;
            }
            System.out.println(b);
            b++;
        }while (b<10);

        int c=1;
        do {
            System.out.println(c);
            c++;
        }while (c<=50);
    }
}
