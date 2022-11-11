package com.jdbc;

import java.sql.*;

public class SelectAllRowsDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employee where eSal>10000");
        boolean flag=false;
        System.out.println("ENO\tENAME\tESAL\tEADDR");
        System.out.println("---------------------------------");
        while (rs.next())
        {
            flag=true;
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
        }
        if (flag==false)
        {
            System.out.println("No Matched Records Found");
        }
        con.close();
    }
}
