package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementOne {
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/luminar";
    static final String USER = "root";
    static final String PASS_WORD = "mysql";
    
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;
    
    public static void insert() {
    	String query="insert into students(student_name,student_mark,student_status) values('taylork',94,'active')";
    	try {
    		pstmt=conn.prepareStatement(query);
    		int result=pstmt.executeUpdate();
    		if(result>0) {
    			System.out.println("inserted succesfully");
    		}
    		
    		
    	
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    public static void view() {
    	String query="select * from students";
    	try {
    		pstmt=conn.prepareStatement(query);
    		rs=pstmt.executeQuery();
    		while(rs.next()) {
    			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getString(4));
            }
            rs.close();
    		
    	}catch(Exception e) {
    		e.getStackTrace();
    	}
    	
    }
    public static void update() {
    	String query="update students set student_name='shayam' where student_id=28";
    	try {
    		pstmt=conn.prepareStatement(query);
    		int result=pstmt.executeUpdate();
    		if(result>0) {
    			System.out.println("updated studnts");
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    public static void delete() {
    	String query="delete * from students where student_id=29";
    	try {
    		pstmt=conn.prepareStatement(query);
    		int result=pstmt.executeUpdate();
    		if(result>0) {
    			System.out.println("updated studnts");
    		}    	
    		}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    }

	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,USER,PASS_WORD);
			
			
			insert();
			view();
			update();
			delete();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
