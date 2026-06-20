<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="mvc.beans.LocationBean" %>
<%@ page import="mvc.dao.LocationDAO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Location</title>
</head>
<body>

<%
int locId =  Integer.parseInt(request.getParameter("caId"));
    LocationBean location = LocationDAO.getLocationById(locId);
    
%>
    <h2>Edit Location Details</h2>
    <form action="LocationUpdateAction.jsp" method="post">
        <input type="hidden" name="locId" value="<%= location.getLocationID() %>" />
        
        location name<input type="text" name="locName" value="<%= location.getLocationName() %>" required/><br/><br/>
        
        location address: <input type="text" name="locAddress" value="<%= location.getLocationAddress() %>" required/><br/><br/>
        
        <input type="submit" value="Save"/>
        <a href="BillLocation.jsp">Cancel</a>
    </form>


</body>
</html>