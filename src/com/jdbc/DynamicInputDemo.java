package com.jdbc;

import java.util.Scanner;

public class DynamicInputDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Number:");
        int eno=sc.nextInt();
        System.out.println("Enter Employee Name:");
        String eName=sc.next();
        System.out.println("Enter Employee Salary:");
        double eSal=sc.nextDouble();
        System.out.println("Enter Employee Address:");
        String eAdd=sc.next();
        String sqlQuery=String.format("insert into employee values(%d,'%s',%f,'%s')",eno,eName,eSal,eAdd);
        System.out.println("Hello...Query with your Dynamic input is:");
        System.out.println(sqlQuery);
    }
}
