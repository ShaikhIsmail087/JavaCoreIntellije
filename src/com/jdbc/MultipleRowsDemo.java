package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MultipleRowsDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","ismail@123");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter Employee Number:");
            int eID=sc.nextInt();
            System.out.println("Enter Employee Name:");
            String eName=sc.next();
            System.out.println("Enter Employee Salary:");
            double eSal=sc.nextDouble();
            System.out.println("Enter Employee Address:");
            String eCity=sc.next();
            String sqlQuery=String.format("insert into employee values(%d,'%s', %f,'%s')",eID,eName,eSal,eCity);
                int updateCount=st.executeUpdate(sqlQuery);
                System.out.println("successful:"+updateCount);
            System.out.println("Record Inserted Successfully");
            System.out.println("Do U want to insert one more record[Yes/No]:");
            String option=sc.next();
            if (option.equalsIgnoreCase("No"))
            {
                break;
            }
        }
        con.close();
    }
}
