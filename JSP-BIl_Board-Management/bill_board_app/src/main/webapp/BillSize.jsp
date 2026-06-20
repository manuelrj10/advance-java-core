<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="mvc.beans.BillboardSizeBean"%>
<%@page import="mvc.dao.BillboardSizeDAO"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="BillSizeAction.jsp" method="post">
		enter Bill Size:<input type="text" name="billSize" /> <input
			type="submit" name="submit" />
	</form>


	<h1 align="center">Bill Size Details</h1>
	<br>
	<br>
	<table>
		<tr>
			<th>SLNO</th>
			<th>Bill Size</th>
		</tr>

		<%
		List<BillboardSizeBean> size = BillboardSizeDAO.getAllBillboardSizes();
		int i = 1;
		for (BillboardSizeBean ba : size) {
		%>
		<tr>
			<td><%=i%></td>
			<td><%=ba.getBillboard_size()%></td>

		</tr>

		<%
		i++;
		}
		%>
		<tr>
		</tr>




	</table>



</body>
</html>