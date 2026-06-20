<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="mvc.beans.LocationBean" %>
<%@ page import="mvc.beans.BillboardSizeBean" %>
<%@ page import="mvc.beans.LocationSizeBean" %>
<%@ page import="mvc.dao.LocationDAO" %>
<%@ page import="mvc.dao.BillboardSizeDAO" %>
<%@ page import="mvc.dao.LocationSizeDAO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Manage Location Pricing</title>
</head>
<body>

    <h1> Location-Size Matrix Pricing</h1>
    <a href="Admin.jsp">Back to Home</a>
    <hr/>


    <form action="LocationSizeController.jsp" method="post">
        
        <label>Select Location:</label>
        <select name="locationId" required>
            <option value="">choose Location</option>
            <%
                List<LocationBean> locations = LocationDAO.getAllLocations(); 
                for(LocationBean loc : locations) {
            %>
                <option value="<%= loc.getLocationID() %>"><%= loc.getLocationName() %></option>
            <% } %>
        </select>
        <br/><br/>

        <label>Bill Board Size</label>
        <select name="sizeId" required>
        <option value="">choose Size</option>
        <%
        List<BillboardSizeBean> sizes=BillboardSizeDAO.getAllBillboardSizes();
        for(BillboardSizeBean size: sizes){
        %>
        <option value="<%= size.getBillboardsize_id() %>"> <%= size.getBillboard_size() %> </option>
        <%}
        %>
        </select>
        <br/><br/>

        <label>Set Rate Price ($):</label>
        <input type="number" step="0.01" name="price"  />
        <br/><br/>

        <label>Initial Status:</label>
        <select name="status">
            <option value="Available">Available</option>
            <option value="Maintenance">Maintenance</option>
        </select>
        <br/><br/>

        <input type="submit" value="Save" />
    </form>

    <hr/>
    <h2>View Current Pricing Bill Records</h2>

    <table border="1" >
        <thead>
            <tr>
                <th>ID</th>
                <th>Location Name</th>
                <th>Billboard Size</th>
                <th>Price</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
  
            <%
            List<LocationSizeBean> matrixList = LocationSizeDAO.getAllLocationSizeMappings();
                    for(LocationSizeBean matrix : matrixList) {
            %>
                <tr>
                    <td><%= matrix.getLocationsize_id() %></td>
                    <td><%= matrix.getLocationName() %></td>
                    <td><%= matrix.getBillboardSizeText() %></td>
                    <td><%= matrix.getPrice() %></td>
                    <td><%= matrix.getStatus() %></td>
                </tr>
            <% 
                    
                } 
            %>
        </tbody>
    </table>

</body>
</html>