<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="mvc.beans.LocationBean" %>
<%@ page import="mvc.dao.LocationDAO" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>location setting</title>
</head>
<body>
<a href="Admin.jsp">back to home???</a>
<h3>add location</h3>
<form action="BillLocationAction.jsp" method="post">
enter location name:<input type="text" name="locName"/>
enter location address:<input type="text" name="locAddress"/>
<input type="submit" name="submit"/>

</form>



	<h1 align="center">Location Details</h1>
	<br>
	<br>
	<table>
		<tr>
			<th>SLNO</th>
			<th>Location Name</th>
			<th>Location Address</th>
		</tr>

		<%
		List<LocationBean> locations = LocationDAO.getAllLocations();
		int i = 1;
		for (LocationBean ca : locations) {
		%>
		<tr>
		<td><%=i %></td>
		<td><%=ca.getLocationName() %></td>
		<td><%=ca.getLocationAddress() %></td>
		<td><a href="LocationEdit.jsp?caId=<%=ca.getLocationID()%>">Edit</a></td>
		<td><a href="LocationDelete.jsp?caId=<%=ca.getLocationID()%>">delete</a></td>
		
		
		
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