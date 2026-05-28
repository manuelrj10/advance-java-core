package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;
import model.Login;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
			try {
				String userName=request.getParameter("userName");
				String passWord=request.getParameter("passWord");
				
				Login login = new Login();//model class object
				login.setUserName(userName);//calling method
				login.setPassWord(passWord);
				
				LoginDAO loginDAO = new LoginDAO();//dao class object
				userName = loginDAO.checkLogin(login);
				
				if(userName!=null) {  //if (flag=true)
					HttpSession session = request.getSession();
					session.setAttribute("user", userName);
					
					response.sendRedirect("home");//doGet() -> redirect
				}else {
					response.sendRedirect("index.html");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}