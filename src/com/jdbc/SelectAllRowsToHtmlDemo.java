package com.jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class SelectAllRowsToHtmlDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employee");
        String data="";
        data=data+"<html><body bgcolor='black' text='yellow'><center><table border='2'>";
        data=data+"<tr><td>ENO</td><td>ENAME</td><td>ESAL</td><td>EADDR</td>";
        while (rs.next())
        {
            data=data+"<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+
                        rs.getDouble(3)+"</td><td>"+rs.getString(4)+"</td><tr>";
        }
        data=data+"</table></center></body></html>";
        FileOutputStream fos=new FileOutputStream("emp.html");
        byte[] b=data.getBytes();
        fos.write(b);//write byte[] to html
        fos.flush();
        System.out.println("Open emp.html to get Employees data");
        fos.close();
        con.close();
    }
}
