package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Login;

public class LoginDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// ------------------------------checkLogin------------------------------

	public String checkLogin(Login login) {
		boolean flagLogin = false;
		String userName = null;
		try {
			conn = DBConnection.getConnetion();
			pstmt = conn.prepareStatement("select * from login where username=? and password=?");
			pstmt.setString(1, login.getUserName());
			pstmt.setString(2, login.getPassWord());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				userName=rs.getString("username");// userName=rs.getString(2);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return userName; 
		
	}
}
	
		
		