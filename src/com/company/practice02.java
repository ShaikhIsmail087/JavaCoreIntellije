package com.company;

import java.util.Scanner;

public class practice02 {
    public static void main(String arg[]) {
//        int a = 4;
//        int b = 17;
//        int c = 6;
//        int sum = a+b+c;
//        System.out.println(sum);

//        question2

//        System.out.println("what is your name");
//        Scanner sc= new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello " + name + " have a good day!");

//        question

//        System.out.println("Enter kilometer");
//Scanner        sc= new Scanner(System.in);
//        float km= sc.nextFloat();
//        System.out.println(km*0.62137+"miles");

//       question 2

//        byte m1,m2,m3;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your marks in physics:");
//        m1 = sc.nextByte();

//        System.out.println("Enter your marks in chemistry:");
//        m2 = sc.nextByte();

//        System.out.println("Enter your marks in Mathematics:");
//        m3 = sc.nextByte();

//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall percentage is " + avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
//            System.out.println("Congratulation, You have been promoted");
//        }
//        else{
//               System.out.println("Sorry, You have not been promoted! Please try again");
//            }

//      question 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter you income in lakh per annum ");
//        float tax = 0;
//        float income = sc.nextFloat();
//       if (income <= 2.5f) {
//            tax = tax + 0;
//        } else if (income > 2.5f && income <= 5f) {
//            tax = tax + 0.05f * (income - 2.5f);
//        } else if (income > 5f && income <= 10f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//
//        } else if (income > 10f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax paid by the employee is: " + tax);

//      question 4

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
 //       }

//       question 6

//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if (website.endsWith(".org")){
//            System.out.println("This is an organizational website");
//        }
//        else if (website.endsWith(".com")) {
//            System.out.println("This is a commercial website");
//        }
//        else if (website.endsWith(".in")) {
//            System.out.println("This is an Indian website");
//        }

//        question 5

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%400==0 || year%4==0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("Its not a leap year");
        }
    }
}
