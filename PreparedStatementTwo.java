package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementTwo {
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/luminar";
    static final String USER = "root";
    static final String PASS_WORD = "mysql";
    
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;
    
    public static void insert(String name,float mark,String status) {
    	String query="insert into students(student_name,student_mark,student_status)"
    			+ "values('"+name+"',"+mark+",'"+status+"')";
    	try {
    		pstmt=conn.prepareStatement(query);
    		int result=pstmt.executeUpdate();
    		if(result>0) {
    			System.out.println("insertion complete");
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    public static void search(int id) {
    	String query="select * from students ";
    		//	+ "where student_id='"+id+"'";
    	try {
    		pstmt=conn.prepareStatement(query);
    		rs=pstmt.executeQuery();
    		while(rs.next()) {
    			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getString(4));
            }
            rs.close();
    		
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    
    public static void update(int id,float mark) {
    	String query="update students set student_mark='"+mark+"' where student_id='"+id+"'";
    	try {
    		pstmt=conn.prepareStatement(query);
    		int result=pstmt.executeUpdate();
    		if(result>0) {
    			System.out.println("updation completed");
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public static void delete(int id) {
    	String query="delete from students where student_id='"+id+"'";
    	try {
    		pstmt=conn.prepareStatement(query);
    		int result=pstmt.executeUpdate();
    		if(result>0) {
    			System.out.println("deletion completed");
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		float mark;
		String status;
		
		System.out.println("enter the student id");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the student name");
		name=sc.nextLine();
		System.out.println("enter the student mark");
		mark=sc.nextFloat();
		sc.nextLine();
		System.out.println("enter the student status");
		status=sc.nextLine();
		
		
	
		
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,USER,PASS_WORD);
			System.out.println("database succesfully connected");
			insert(name,mark,status);
			System.out.println("enter the id to search");
			id=sc.nextInt();
			search(id);
			System.out.println("enter the id to upade");
			int upId=sc.nextInt();
			System.out.println("enter the mark");
			float upMark=sc.nextFloat();
			update(upId,upMark);
			
			System.out.println("enter the id to upade");
			int delId=sc.nextInt();
			delete(delId);
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
