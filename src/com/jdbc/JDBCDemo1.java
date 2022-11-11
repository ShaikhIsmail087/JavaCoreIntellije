package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","ismail@123");
        System.out.println(con.getClass().getName());
        Statement st= con.createStatement();
        st.executeUpdate("create table client(id int(100) primary key auto_increment not null,eName varchar(20) not null,ePassword varchar(25) not null,email varchar(50))");
        System.out.println("Table Created Successfully");
        if (con!=null)
        {
            System.out.println("Connection established Successfully");
        }
        else
        {
            System.out.println("Connection not established");
        }
        int[] a={200,120,016};
        for (int i:a){
            System.out.println(i);
        }
    }
}
