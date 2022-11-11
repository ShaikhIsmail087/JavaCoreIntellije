package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertSingleRowDemo {
    public static void main(String[] args) throws SQLException {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","ismail@123");
        Statement st= con.createStatement();

        int updateCount=st.executeUpdate("insert into employee values(101,'Ahmed',18000,'Mumbai')");//hard code(bad)
        System.out.println("The numbers of rows inserted:"+updateCount);
        con.close();
    }
}
