package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DemoPractise {
	
	final static String DRIVER="com.mysql.cj.jdbc.Driver";
	final static String URL="jdbc:mysql://localhost:3306/practicedemo";
	final static String USER="root";
	final static String PASSWORD="mysql";
	
	
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	static Connection conn=null;
	
	
	
	public static void insert(String fName,String lName,int age,float salary,String address,String gender) {
		String Query="insert into biodata(first_name,last_name,age,salary,address,gender)"
				+ " values('"+fName+"','"+lName+"',"+age+","+salary+",'"+address+"','"+gender+"')";
		try {
			pstmt=conn.prepareStatement(Query);
			int result=pstmt.executeUpdate();
			if(result>0) {
				System.out.println("values inserted");
				
			}
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first name");
		String fName=sc.nextLine();
		System.out.println("enter the last name");
		String lName=sc.nextLine();
		sc.nextLine();
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		System.out.println("enter the salary");
		float salary=sc.nextFloat();
		sc.nextLine();
		System.out.println("enter the address");
		String address=sc.nextLine();
		System.out.println("enter the gender");
		String gender=sc.nextLine();
		
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("connection succesful");
			
			insert(fName,lName,age,salary,address,gender);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
