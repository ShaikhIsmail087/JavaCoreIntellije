package com.jdbcmysql;

import java.sql.*;
class JdbcDemo
{
	public static void main(String[] args)throws Exception{
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		/*String url="jdbc:mysql://localhost:3306/youtube";
		String username="ismail@123";
		String password="ismail@123";
		
		Connection con=DriverManager.getConnection(url,username,password);*/
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","ismail@123");
		
		if(con.isClosed()){
			System.out.println("Connection is Closed");
		}
		else{
			System.out.println("Connection Created...");
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
