package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondCookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			response.setContentType("text/html");

			PrintWriter out = response.getWriter();

			
			Cookie ck[] = request.getCookies();
			out.println("Name" + ck[0].getValue());
			out.println("<br");
			out.println("role" + ck[1].getValue());
			out.println("<br");
			
			for(Cookie c:ck) {
				System.out.println(c.getName()+"      "+c.getValue());
				out.println(c.getName()+"    "+c.getValue() );
				out.println("<br>");
			}


	
			out.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}