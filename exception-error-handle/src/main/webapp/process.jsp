<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
window.history.forward();
function noBack(){//disable back buuton in brower
	window.history.forward();
}
document.onmousedown=disableclick;
status="welcome to demo project";//disable mouse down
function disableclick(event){
	if(event.button==2){
		alert(status);
		return false;
	}
}
</script>
</head>
<body>
<%
int num1=Integer.parseInt(request.getParameter("num1"));
int num2=Integer.parseInt(request.getParameter("num2"));
int result=num1/num2;
out.println("result"+result);



%>

</body>
</html>