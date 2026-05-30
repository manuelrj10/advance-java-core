package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstCookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			response.setContentType("text/html");
            PrintWriter out = response.getWriter();

			String name = request.getParameter("userName");
			
			Cookie cookieName = new Cookie("uname",name);//
			Cookie cookieRole = new Cookie("trainer","role");//
			
			response.addCookie(cookieName);
			response.addCookie(cookieRole);
			 out.println("<form action='second' method='post'>");
			out.println("<input type='submit' value='go'>");
			out.println("</form>");

			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}