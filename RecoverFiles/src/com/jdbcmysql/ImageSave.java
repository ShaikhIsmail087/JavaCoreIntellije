package com.jdbcmysql;

import java.sql.*;
import java.io.*;

class ImageSave
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","ismail@123");
			String q="insert into images(pic) values(?)";
			PreparedStatement p=con.prepareStatement(q);
			//p.setString(1,"value");
			FileInputStream fis=new FileInputStream("nature.jpg");
			p.setBinaryStream(1,fis,fis.available());
			p.executeUpdate();
			System.out.println("done...");
			
		}
		catch(Exception e)
		{
			System.out.println("Error !!");
		}
	}
}
