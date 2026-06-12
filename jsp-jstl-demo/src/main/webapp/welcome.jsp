<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%
List<String> lst=new ArrayList<>();
lst.add("apple");
lst.add("orange");
lst.add("garapes");
request.setAttribute("alist", lst);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	first name<c:out value="${param.firstName }"></c:out>
	<br> 
	last name <c:out value="${param.lastName }"></c:out>
	<br>
	
	Array List Values<br>
	<c:forEach items="${alist}" var="listItem">
	${listItem}
	</c:forEach>
	<br>

<c:forEach var="counter" begin="1" end="10">
	<c:out value="${counter }"></c:out>
	</c:forEach>
	<%--intailization --%>
	<c:set var="num" value="10"></c:set>
	<%--loop --%>
	<c:choose>
	<c:when test="${num%2==0 }">
	<c:out value="${num } is even"></c:out>
	</c:when>
	<c:otherwise>
	<c:out value="${num } is odd"></c:out>
	</c:otherwise>
	</c:choose>
	
	
	Stringfunction<br>
	<c:set var="st" value="welcome to luminar"></c:set>
	<c:if test="${fn:contains(st,'luminar')}">
	<p>found luminar</p>
	</c:if>
	length of the string is: ${fn:length(st)}
	<br>
	
	

</body>
</html>