<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="mvc.beans.BillboardPurchaseBean" %>
<%@ page import="mvc.dao.PaymentDAO" %>
<!DOCTYPE html>
<html>
<head><title>Admin Billing Ledger Management</title></head>
<body>
    <h1>Admin Financial Operations Dashboard - Payment Status Tracking</h1>
    <a href="Admin.jsp">Back to Home</a><hr/>
    
    <%
        String msg = request.getParameter("msg");
        if("updated".equals(msg)) out.print("<p style='color:green;'>Payment reconciliation log updated successfully!</p>");
    %>

    <table border="1" cellpadding="5" cellspacing="0">
        <thead>
            <tr>
                <th>Purchase ID</th>
                <th>Client Company</th>
                <th>Leased Location Location</th>
                <th>Total Bill Amount</th>
                <th>Current Payment Status</th>
                <th>Mark / Update Transaction Log</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<BillboardPurchaseBean> bills = PaymentDAO.getAllPaymentsStatus();
                for(BillboardPurchaseBean b : bills) {
            %>
                <tr>
                    <td><%= b.getPurchaseId() %></td>
                    <td><%= b.getCompanyName() %></td>
                    <td><%= b.getLocationName() %></td>
                    <td>$<%= b.getAmouunt() %></td>
                    <td><strong><%= b.getBillBoardSizetext() %></strong></td>
                    <td>
                        <form action="UpdatePaymentAction.jsp" method="post" style="display:inline;">
                            <input type="hidden" name="purchaseId" value="<%= b.getPurchaseId() %>" />
                            <select name="status">
                                <option value="Pending">Pending</option>
                                <option value="Paid">Paid</option>
                            </select>
                            <input type="submit" value="Reconcile Settlement" />
                        </form>
                    </td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>