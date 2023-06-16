package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class selectQuery{

	public static void main(String[] args)  throws ClassNotFoundException, SQLException{
		/*
		   ## steps in JDBC connectivity:
		   1)Driver class loading
		   2)connection object creation
		   3)Statement or Prepare statement
		   4)Result set 
		*/
		
		/* #To add referenced libraries: i.e to add mysql externaljar file which is absent in jre sys lib#
		-->Click on project
		-->Build path
		-->Configure build path
		-->Library
		-->classpath
		-->add external jar
		-->choose file
		-->apply and close
		*/
		
		//driver class loading
		Class.forName("com.mysql.cj.jdbc.Driver");
         //connection object creation
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse","root","mysql123");
		//System.out.println("hema");
		//statement object creation
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from cseb;");
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("marks"));
			rs.next();
		}
	}

}
