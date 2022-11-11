package com.jdbc;

import java.sql.*;

public class SelectParticularColumnsDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select eName,eCity from employee");
        boolean flag=false;
        System.out.println("ENAME\tEADDR");
        System.out.println("-----------------");
        while (rs.next())
        {
            flag=true;
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        if (flag==false)
        {
            System.out.println("No Matched Records Found");
        }
        con.close();
    }
}
