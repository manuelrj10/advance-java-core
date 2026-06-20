<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="mvc.beans.CustomerBean" %>
<%@ page import="mvc.dao.CustomerDAO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Manage Customers</title>
</head>
<body>

    <h1>Admin Dashboard - Customer Profiles Management</h1>
    <a href="Admin.jsp">Back to Home</a>
    <hr/>

   

    <form action="CustomerActionControl.jsp" method="post">
        <table >
            <tr>
                <td>Company Name:</td>
                <td><input type="text" name="companyName" /></td>
            </tr>
            <tr>
                <td>Contact Person Name:</td>
                <td><input type="text" name="contactPerson"  /></td>
            </tr>
            <tr>
                <td>Phone</td>
                <td><input type="text" name="phone"  /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Register " /></td>
            </tr>
        </table>
    </form>

    <hr/>
    <h2>Clients</h2>

    <table border="1" >
        <thead>
            <tr>
                <th>Customer ID</th>
                <th>Company Name</th>
                <th>Contact Person</th>
                <th>Phone Connection</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<CustomerBean> clients = CustomerDAO.getAllCustomers();

                    for(CustomerBean client : clients) {
            %>
                <tr>
                    <td><%= client.getCustomerId() %></td>
                    <td><%= client.getCompanyName() %></td>
                    <td><%= client.getContactPerson() %></td>
                    <td><%= client.getPhone() %></td>
                </tr>
            <% 
                    }
            %>
        </tbody>
    </table>

</body>
</html>