package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class SQLInjectionDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st= con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username:");
        String uname=sc.next();
        System.out.println("Enter pwd:");
        String upwd=sc.next();
        String sqlQuery="select count(*) from users where eName='"+uname+"'and ePwd='"+upwd+"'";
        ResultSet rs=st.executeQuery(sqlQuery);//special character is the reason of SQLInjection attack like '--
        int c=0;
        if(rs.next())
        {
            c=rs.getInt(1);
        }
        if (c==0)
            System.out.println("Invalid Credentials");
        else
            System.out.println("Valid Credentials");
        con.close();
    }
}
