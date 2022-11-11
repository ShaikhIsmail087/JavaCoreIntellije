package com.jdbc;

import java.sql.*;

public class AggregateFunctionDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employee where eSal in (select max(eSal) from employee)");
//        ResultSet rs=st.executeQuery("select count(*) from employee");
//        ResultSet rs=st.executeQuery("select max(eSal) from employee");
//        ResultSet rs=st.executeQuery("select min(eSal) from employee");
        System.out.println("Highest Sal employee information");
        System.out.println("-------------------------------------");
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
        }
        if (rs.next())
        {
            System.out.println(rs.getInt(1));
        }
        con.close();
    }
}
