package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDropTableDemo {
    public static void main(String[] args) throws SQLException {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","ismail@123");
        Statement st= con.createStatement();
        st.executeUpdate("drop table employee");
        System.out.println("Table Deleted Successfully");
        con.close();
    }
}
