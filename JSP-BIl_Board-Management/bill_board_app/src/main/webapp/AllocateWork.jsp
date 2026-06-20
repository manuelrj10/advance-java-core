<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="mvc.beans.InspectorBean" %>
<%@ page import="mvc.beans.BillboardPurchaseBean" %>
<%@ page import="mvc.beans.WorkAllocationBean" %>
<%@ page import="mvc.dao.InspectorDAO" %>
<%@ page import="mvc.dao.BillboardPurchaseDAO" %>
<%@ page import="mvc.dao.WorkAllocationDAO" %>
<!DOCTYPE html>
<html>
<head><title>Work Task Allocations Engine</title></head>
<body>
    <h1>Task Management Engine - Allocate Inspection Tasks</h1>
    <a href="Admin.jsp">Back to Dashboard</a><hr/>
    <% 
        String msg = request.getParameter("msg");
        if("success".equals(msg)) out.print("<p style='color:green;'>Task assigned successfully to Inspector profile!</p>");
        if("failed".equals(msg)) out.print("<p style='color:red;'>Task submission allocation failed.</p>");
    %>
    <form action="WorkAllocationAction.jsp" method="post">
        <table cellpadding="4">
            <tr>
                <td>Select Target Inspector:</td>
                <td>
                    <select name="inspectorId" required>
                        <option value="">-- Choose Profile --</option>
                        <% for(InspectorBean ins : InspectorDAO.getAllInspectors()) { %>
                            <option value="<%= ins.getInspectorId() %>"><%= ins.getInspectorName() %></option>
                        <% } %>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Select Billboard Lease Order:</td>
                <td>
                    <select name="purchaseId" required>
                        <option value="">-- Choose Order Log --</option>
                        <% for(BillboardPurchaseBean ord : BillboardPurchaseDAO.getAllPurchases()) { %>
                            <option value="<%= ord.getPurchaseId() %>">
                                Order ID: <%= ord.getPurchaseId() %> - Company: <%= ord.getCompanyName() %> (<%= ord.getLocationName() %>)
                            </option>
                        <% } %>
                    </select>
                </td>
            </tr>
            <tr><td>Target Inspection Date:</td><td><input type="date" name="assignedDate" required /></td></tr>
            <tr><td>Task Work Description:</td><td><input type="text" name="workDescription" required /></td></tr>
            <tr><td colspan="2"><input type="submit" value="Dispatch Task Assignment Order" /></td></tr>
        </table>
    </form>
    <hr/>
    <h2>Dispatched Inspection Operations Board</h2>
    <table border="1" cellpadding="5" cellspacing="0">
        <thead>
            <tr><th>Task ID</th><th>Inspector</th><th>Client Log</th><th>Location Space</th><th>Inspection Date</th><th>Description</th><th>Operational Status</th></tr>
        </thead>
        <tbody>
            <%
                List<WorkAllocationBean> logList = WorkAllocationDAO.getAllAllocatedTasks();
                for(WorkAllocationBean t : logList) {
            %>
                <tr>
                    <td><%= t.getWorkId() %></td>
                    <td><%= t.getInspectorName() %></td>
                    <td><%= t.getCompanyName() %></td>
                    <td><%= t.getLocationName() %></td>
                    <td><%= t.getAssignedDate() %></td>
                    <td><%= t.getWorkDescription() %></td>
                    <td><strong><%= t.getStatus() %></strong></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>