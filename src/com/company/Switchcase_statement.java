package com.company;

import java.util.Scanner;

public class Switchcase_statement {
    public static void main(String[] args) {
     /*  String var="Saad";

        switch (var) {
            case "Saad" ->{System.out.println("You are going to become an Adult!");
            case "Rashid" -> System.out.println("You are going to get a job!");
            case "Salim" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life!");
       }
}     System.out.println("Thanks for using Java");
 */




         int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced");
        }
        else if (age>46) {
            System.out.println("You are semi-experienced");
        }
        else if (age>36) {
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println("You are not experienced");
        }


   }
}