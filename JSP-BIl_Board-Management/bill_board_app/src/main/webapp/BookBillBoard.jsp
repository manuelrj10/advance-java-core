<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="mvc.beans.CustomerBean"%>
<%@ page import="mvc.beans.LocationSizeBean"%>
<%@ page import="mvc.beans.BillboardPurchaseBean"%>
<%@ page import="mvc.dao.CustomerDAO"%>
<%@ page import="mvc.dao.LocationSizeDAO"%>
<%@ page import="mvc.dao.BillboardPurchaseDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Billboard Rental</title>
</head>
<body>

	<h1>Admin Dashboard - Book Billboard Advertisement Space</h1>
	<a href="Admin.jsp">Back to Home</a>
	<hr />



	<form action="BillBoardPurchaseAction.jsp" method="post">

		Select Client Company: <select name="customerId" required>
			<option value="">-- select company Customer</option>
			<%
			List<CustomerBean> customers = CustomerDAO.getAllCustomers();
			for (CustomerBean c : customers) {
			%>
			<option value="<%=c.getCustomerId()%>"><%=c.getCompanyName()%>
			</option>
			<%
			}
			%>
		</select> Select Billboard size and loaction
		<select name="locationSizeId" required>
			<option value="">Choose Location & Size</option>
			<%
			List<LocationSizeBean> slots = LocationSizeDAO.getAllLocationSizeMappings();
			for (LocationSizeBean s : slots) {
			%>
			<option value="<%=s.getLocationsize_id()%>">
				<%=s.getLocationName()%> [<%=s.getBillboardSizeText()%>] - $<%=s.getPrice()%>/day
			</option>
			<%
			}
			%>
		</select>
		Lease Start Date: <input type="date" name="startDate" required />

		Duration(days) <input type="number" min="1" name="duration" required />

		<input type="submit" value="Confirm Order" />

	</form>

	<hr />
	<h2>Active Billboard Rental Order Records Ledger</h2>

	<table border="1" >
		<thead>
			<tr>
				<th>booking ID</th>
				<th>company Name</th>
				<th>physical Location</th>
				<th>billboard Size</th>
				<th>start Date</th>
				<th>duration (days)</th>
				<th>total Calculated Amount</th>
			</tr>
		</thead>
		<tbody>
			<%
			List<BillboardPurchaseBean> orders = BillboardPurchaseDAO.getAllPurchases();
		
			for (BillboardPurchaseBean order : orders) {
			%>
			<tr>
				<td><%=order.getPurchaseId()%></td>
				<td><%=order.getCompanyName()%></td>
				<td><%=order.getLocationName()%></td>
				<td><%=order.getBillBoardSizetext()%></td>
				<td><%=order.getStartDate()%></td>
				<td><%=order.getDuration()%></td>
				<td>$<%=order.getAmouunt()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

</body>
</html>