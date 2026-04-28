package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlJavaStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/luminar","root","mysql");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from students");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
