<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="mvc.beans.WorkAllocationBean" %>
<%@ page import="mvc.dao.WorkAllocationDAO" %>
<%@ page import="mvc.beans.LoginBean" %>
<%@ page import="mvc.dao.LoginDAO" %>
<!DOCTYPE html>
<html>
<head><title>Inspector Field Portal</title></head>
<body>

    <%
        // Extract basic session handling data tracking validation components
        String userName = (String) session.getAttribute("username");
        if(userName == null) {
            response.sendRedirect("login.html");
            return;
        }
        
        // Lookup dynamic details from our basic authentication setup mappings
        // Since your current setup saves user name, we query tasks via login details or username
        // For testing simplicity without altering your working core login bean, we pull via current session username
        int mockedLoginId = 2; // In a production system, map your unique sequence session key index here!
    %>

    <h1>Inspector Operations Work Field Portal</h1>
    <h2>Welcome back field officer, <%= userName %>!</h2>
    <a href="LogoutAction.jsp">Sign-Out Securely</a>
    <hr/>

    <%
        String msg = request.getParameter("msg");
        if("updated".equals(msg)) out.print("<p style='color:green;'>Operational task status successfully declared!</p>");
    %>

    <h3>Your Dispatched Inspection Assignments</h3>
    <table border="1" cellpadding="5" cellspacing="0">
        <thead>
            <tr>
                <th>Task ID</th>
                <th>Client Tenant</th>
                <th>Billboard Space Location</th>
                <th>Operational Deadline</th>
                <th>Task Target Details</th>
                <th>Current Status</th>
                <th>Action Action Control</th>
            </tr>
        </thead>
        <tbody>
            <%
                // For direct testing out-of-the box, pass your target assigned inspector credentials
                List<WorkAllocationBean> tasks = WorkAllocationDAO.getAllAllocatedTasks(); 
                if(tasks.isEmpty()) {
            %>
                <tr><td colspan="7">No work items assigned to your profile dashboard queue yet.</td></tr>
            <%
                } else {
                    for(WorkAllocationBean t : tasks) {
            %>
                <tr>
                    <td><%= t.getWorkId() %></td>
                    <td><%= t.getCompanyName() %></td>
                    <td><%= t.getLocationName() %></td>
                    <td><%= t.getAssignedDate() %></td>
                    <td><%= t.getWorkDescription() %></td>
                    <td><strong><%= t.getStatus() %></strong></td>
                    <td>
                        <form action="UpdateTaskAction.jsp" method="post" style="display:inline;">
                            <input type="hidden" name="workId" value="<%= t.getWorkId() %>" />
                            <select name="status">
                                <option value="In Progress">In Progress</option>
                                <option value="Completed">Completed</option>
                                <option value="Issue Reported">Issue Reported</option>
                            </select>
                            <input type="submit" value="Update Status" />
                        </form>
                    </td>
                </tr>
            <% 
                    }
                }
            %>
        </tbody>
    </table>

</body>
</html>