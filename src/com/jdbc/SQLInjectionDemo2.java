package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class SQLInjectionDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        String sqlQuery="select count(*) from users where eName=? and ePwd=?";
        PreparedStatement pst= con.prepareStatement(sqlQuery);//at the compilation of sqlQuery SQLInjection attack resolved
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username:");
        String uname=sc.next();
        System.out.println("Enter pwd:");
        String upwd=sc.next();
        pst.setString(1,uname);
        pst.setString(2,upwd);
        ResultSet rs=pst.executeQuery();
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
