package com.jdbcmysql;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UpdateJdbc {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "ismail@123");
		String q="update table1 set tName=? ,tCity=? where tID=?";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter new name: ");
		String name=br.readLine();
		
		System.out.println("Enter new city: ");
		String city=br.readLine();
		
		System.out.println("Enter the new id: ");
		int id=Integer.parseInt(br.readLine());
		
		PreparedStatement p=con.prepareStatement(q);
		
		p.setString(1, name);
		p.setString(2, city);
		
		p.setInt(3, id);
		p.executeUpdate();
		System.out.println("done.............");
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
