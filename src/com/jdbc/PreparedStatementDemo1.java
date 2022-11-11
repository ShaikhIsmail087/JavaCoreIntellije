package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        String sqlQuery="delete from employee where eName=?";//Dynamic Query
        PreparedStatement pst=con.prepareStatement(sqlQuery);//Query will compile only once
        pst.setString(1,"Saad");
        int updateCount=pst.executeUpdate();
        System.out.println("The number of row deleted: "+updateCount);

        System.out.println("Reusing PreparedStatement to delete one more record...");
        pst.setString(1,"Ahmed");
        int updateCount1= pst.executeUpdate();
        System.out.println("The number of row deleted:"+updateCount1);
        con.close();
    }
}
