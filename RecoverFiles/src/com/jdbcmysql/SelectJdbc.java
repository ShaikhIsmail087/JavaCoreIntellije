package com.jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJdbc {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube ","root", "ismail@123");
		String q="select * from table1";
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery(q);
		while(r.next()) 
		{
			int id=r.getInt(1);
			String name=r.getString(2);
			String city=r.getString(3);
			System.out.println(id+" : "+name+" : "+city);
		}
		con.close();
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}
}
