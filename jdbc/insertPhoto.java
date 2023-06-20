package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertPhoto {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse","root","mysql123");
        PreparedStatement ps = con.prepareStatement("insert into photo values(?,?);");
        ps.setInt(1,1);
        File f = new File("E:\\lav.jfif");
        FileInputStream fis =  new FileInputStream(f);
        ps.setBlob(2, fis);
        int row = ps.executeUpdate();
        if(row>0)
        {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
	}

}
