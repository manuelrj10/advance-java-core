<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="mvc.beans.InspectorBean" %>
<%@ page import="mvc.dao.InspectorDAO" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Inspector</title>
</head>
<body>Customer Inspector Management</h1>
    <a href="Admin.jsp">Back to Home</a>
    <hr/>

   

    <form action=InspectorActionControl.jsp method="post">
       
                Inspector Name:
               <input type="text" name="inspectorName" />
           
            
               Inspector phone No:
               <input type="text" name="inspectorPerson"  />
         		
         	   Username
               <input type="text" name="inspectorUsername"  />
               Password
               <input type="text" name="inspectorPassword"  />
            
               <input type="submit" value="Register " />
            
        
    </form>

    <hr/>
    <h2>Inspectors</h2>

    <table border="1" >
        <thead>
            <tr>
                <th>Inspector ID</th>
                <th>Inspector Name</th>
                 <th>Inspector phone</th>
                <th>Inspector username</th>
                <th>Inspector password</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<InspectorBean> clients = InspectorDAO.getAllInspectors();

                    for(InspectorBean client : clients) {
            %>
                <tr>
                    <td><%= client.getInspectorId() %></td>
                    <td><%= client.getInspectorName() %></td>
                    <td><%= client.getPhone() %></td>
                    
                    <td><%= client.getUsername() %></td>
                    <td><%= client.getPassword() %></td>
                </tr>
            <% 
                    }
            %>
        </tbody>
    </table>

</body>
</html>

