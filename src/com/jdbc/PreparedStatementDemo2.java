package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        String sqlQuery="insert into employee values(?,?,?,?)";//Dynamic Query
        PreparedStatement pst=con.prepareStatement(sqlQuery);//Query will compile only once
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
            pst.setInt(1,eID);
            pst.setString(2,eName);
            pst.setDouble(3,eSal);
            pst.setString(4,eCity);
            System.out.println("Record Inserted successfully");
            System.out.println("Do you want to insert one more record[yes/no]");
            String option=sc.next();
            if (option.equalsIgnoreCase("No"))
            {
                break;
            }
        }
        con.close();
    }
}
