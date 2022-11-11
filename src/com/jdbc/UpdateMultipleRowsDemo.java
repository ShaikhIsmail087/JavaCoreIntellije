package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMultipleRowsDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Increment Amount:");
        double increment=sc.nextDouble();
        System.out.println("Enter Salary Range:");
        double salRange=sc.nextDouble();
        String sqlQuery=String.format("update employee set eSal=eSal+%f where eSal<%f",increment,salRange);
        int updateCount=st.executeUpdate(sqlQuery);
        System.out.println("The no of rows updated :"+updateCount);
        con.close();
    }
}
