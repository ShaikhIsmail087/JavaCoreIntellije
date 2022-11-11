package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class SelectNonSelectDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Query:");
        String sqlQuery=sc.nextLine();
        boolean b= st.execute(sqlQuery);
        if (b==true)//select query
        {
            ResultSet rs=st.getResultSet();
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+
                                    "\t"+rs.getString(4));
            }
        }
        else //non select query
        {
            int rowCount=st.getUpdateCount();
            System.out.println("The number of records effected is:"+rowCount);
        }
        con.close();
    }
}
