package com.jdbc;

import java.sql.*;

public class StoredProceduresDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        CallableStatement cst=con.prepareCall("{call addProc(?,?,?)}");
        cst.setInt(1,123456789);
        cst.setInt(2,123456789);
        cst.registerOutParameter(3, Types.INTEGER);
        cst.execute();
        System.out.println("result.."+cst.getInt(3));
        con.close();
    }
}
