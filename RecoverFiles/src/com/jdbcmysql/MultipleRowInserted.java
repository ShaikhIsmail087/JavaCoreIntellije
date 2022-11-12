package com.jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MultipleRowInserted {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","ismail@123");
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
            String sqlQuery=String.format("insert into employee(%d , '%s' , %f , '%s')" ,eID ,eName ,eSal ,eCity);
            try {
                st.executeUpdate(sqlQuery);
            }catch (Exception e){}
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
