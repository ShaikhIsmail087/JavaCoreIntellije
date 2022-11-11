package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class SelectRangeOfRecordsDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter City Name:");
//        String addr=sc.next();
//        String sqlQuery=String.format("select * from employee where eCity='%s'",addr);
//        ResultSet rs=st.executeQuery(sqlQuery);
//        System.out.println("Enter Begin salary Range:");
//        double beginSal=sc.nextDouble();
//        System.out.println("Enter End salary Range");
//        double endSal=sc.nextDouble();
//        String sqlQuery=String.format("select * from employee where eSal>=%f and eSal<=%f",beginSal,endSal);
//        ResultSet rs= st.executeQuery(sqlQuery);
        System.out.println("Enter Initial Characters of Employee Name:");
        String initialChar=sc.nextLine()+"%";
        String sqlQuery=String.format("select * from employee where eName like '%s'",initialChar);
        ResultSet rs= st.executeQuery(sqlQuery);
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
