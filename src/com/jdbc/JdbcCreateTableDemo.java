package com.jdbc;

import java.sql.*;

public class JdbcCreateTableDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st= con.createStatement();
//        st.executeUpdate("create table employee(eID number(5) primary key,eName varchar(200) not null,eSal number(10),eCity varchar(200))");
        st.executeUpdate("create table users(eName varchar(12),ePwd varchar(15))");
        System.out.println("Table Created Successfully");
        con.close();
    }
}
