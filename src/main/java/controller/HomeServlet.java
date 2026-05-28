package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		HttpSession session= request.getSession(false);
		String name= (String) session.getAttribute("user");
		
		
		out.print("<html><bod>");
		out.print("<h1 align ='center'>JASMINE</h1><br>");
		out.print("<h3>Welcome "+name+ "</h1><br>");
		
		
		
		
		
		

		try {

			out.println("<html><body>");

			out.println("<h1 align='center'>Jasmine App</h1><br><br>");
			out.println("<h2> Welcome </h2>");

			out.println("<a href='purchase'>Purchase</a>&nbsp;&nbsp;&nbsp;");

			out.println("<a href='product'>Product</a>&nbsp;&nbsp;&nbsp;");

			out.println("<a href='order'>Order</a>&nbsp;&nbsp;&nbsp;");

			out.println("<a href='sale'>Sale</a>&nbsp;&nbsp;&nbsp;");

			out.println("<a href='bill'>Bill</a>&nbsp;&nbsp;&nbsp;");

			out.println("Report " );

			out.println("<ul> &nbsp;&nbsp;&nbsp;");

			out.println("<li><a href='purchasereport'>Purchase Report</a></li>");

			out.println("<li><a href='stockreport'>Stock Report</a></li>");

			out.println("<li><a href='orderreport'>Order Report</a></li>");

			out.println("<li><a href='salereport'>Sale Report</a></li>");

			out.println("</ul>");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}