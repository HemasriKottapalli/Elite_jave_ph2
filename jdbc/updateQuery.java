package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String name="hemu";
		int id =100;
		Class.forName("com.mysql.cj.jdbc.Driver");
        //connection object creation
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse","root","mysql123");
		//prepare statement object creation
		PreparedStatement ps=con.prepareStatement("update cseb set name=? where id=?");
		ps.setString(1, name);
		ps.setInt(2,id);
		int row=ps.executeUpdate();
	    if(row>0)
	    {
	    	System.out.println("yesss");
	    }else {
	    	System.out.println("is it updated?\nNope nah ellehe");
	    }

	}

}
