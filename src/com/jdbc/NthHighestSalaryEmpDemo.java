package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class NthHighestSalaryEmpDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        String sqlQuery="select * from(select eID,eName,eSal,eCity,rank() over(order by eSal DESC) ranking from employee) where ranking="+n;
        ResultSet rs=st.executeQuery(sqlQuery);
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+
                                "\t"+rs.getString(4));
        }
        con.close();
    }
}
