<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body>

<h1>Admin Dashboard</h1>
<% String userName = (String) session.getAttribute("username"); %>
<h2>Welcome, <%= userName %>!</h2>

<ul>
    <li><a href="Setting.jsp">System Settings (Locations, Sizes & Pricing)</a></li>
    <li><a href="ManageCustomers.jsp">Customer Management</a></li>
    <li><a href="BookBillBoard.jsp">Billboard Purchase Management</a></li>
    <li><a href="AllocateWork.jsp">Work Allocation Management</a></li>
    <li><a href="ManagePayments.jsp">Payment Tracking Ledger</a></li>
    <li><a href="RegisterInspector.jsp">Register Inspector</a></li>
    <li><a href="LogoutAction.jsp">Logout</a></li>
</ul>

</body>
</html>