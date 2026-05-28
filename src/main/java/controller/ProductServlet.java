package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		try {

			out.println("<html><body>");

			out.println("<h1 align='center'> Product </h1><br><br>");

			out.println("<form action='addproduct' method='post'>");

			out.println("Product Date : ");
			out.println("<input type='date' name='productdate'><br><br>");

			out.println("Product Price : ");
			out.println("<input type='text' name='productprice'><br><br>");

			out.println("Product Quantity : ");
			out.println("<input type='text' name='productqty'><br><br>");

			out.println("<input type='submit' value='Add Product'>");

			out.println("</form>");

			out.println("<br><br>");

			out.println("<a href='home'>Back to Home</a>");

			out.println("</body>");
			out.println("</html>");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}