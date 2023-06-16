package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertionQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Driver class loading
		Class.forName("com.mysql.cj.jdbc.Driver");
        //connection object creation
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse","root","mysql123");
		//System.out.println("hema");
		//statement object creation
		Statement s = con.createStatement();
		//int row = s.executeUpdate("insert into devs values \r\n"
		//		+ "(4,\"Doctor2\",234585677,\"ofc doctor\",90);");
//		if(row>0)
//		{
//			System.out.println("yes");
//		}
		//using prepared statements to give data dynamically
		Scanner inp = new Scanner(System.in);
		int id=inp.nextInt();
		String name=inp.next();
		String pan =inp.next();
		String job =inp.next();
		int age=inp.nextInt();
        PreparedStatement ps = con.prepareStatement("insert into devs values(?,?,?,?,?);");
		
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3,pan);
		ps.setString(4,job);
		ps.setInt(5, age);
		
		int row1 =ps.executeUpdate();
		if(row1>0)
		{
			System.out.println("yes");
		}
	}

}
