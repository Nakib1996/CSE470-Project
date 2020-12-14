package com.gm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	public static Connection conn;
    public PreparedStatement ps1,ps2,ps3;
	public ResultSet rs1;
	public boolean rs2;
    
    public static Connection getMySQLConnection() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/artgallery","root","");
			
			return conn;
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    	

    	
    }
    
}
