package com.training.utils;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class SqlConnection {

	
	public static Connection getSqlConnection() {
		
		Connection con =null;
	
		FileInputStream stream = null;
		try {
			
			stream = new FileInputStream(new File("DbConnection.properties"));
			
			Properties props = new Properties();
			
			props.load(stream);
			
			Class.forName(props.getProperty("db.driverClass"));
			
			con = DriverManager.getConnection(props.getProperty("db.url"), 
					props.getProperty("db.userName"), props.getProperty("db.passWord"));
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
	}
	
}
