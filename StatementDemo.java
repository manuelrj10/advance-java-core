package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementDemo {

    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/luminar";
    static final String USER = "root";
    static final String PASS_WORD = "mysql";
    
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;

    public static void create() {
        try {
            stmt = conn.createStatement();
           
            String sql = "INSERT INTO students (student_name, student_mark, student_status) VALUES ('John', 85.5, 'active')";
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                System.out.println("Values inserted successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void retrieve() {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM students");
            
            while (rs.next()) {
                
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getString(4));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update() {
        try {
            stmt = conn.createStatement();
           
            int result = stmt.executeUpdate("UPDATE students SET student_status='inactive', student_name='manuel' WHERE student_id=1");
            if (result > 0) {
                System.out.println("Record updated successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete() {
        try {
            stmt = conn.createStatement();
            
            int result = stmt.executeUpdate("DELETE FROM students WHERE student_id=6");
            if (result > 0) {
                System.out.println("Record deleted successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS_WORD);
            
            System.out.println("Connected to database...");

          
            create();
            update();
            delete();
            retrieve(); 

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}