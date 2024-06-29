<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP WEB APP</title>
</head>
<body>
	<h1>JSP Web App to generate Dynamic Response</h1>

	<!-- Declaration tag -->
	<%!int age = 18;
	String name = "Hamidu";%>

	<!--Directive Tag =>
	is to import classes from Java -->
	<%@ page import="java.util.Date"%>

	<!-- Script tag -->
	<%
	String uname = request.getParameter("uname");
	String ucity = request.getParameter("ucity");

	Date date = new Date();
	out.println(date);
	%>

	<!-- Expression Tag 
	=> to print variables and Strings without out.println() -->
	<h1>
		<%="Hello " + uname%>
	</h1>
	<h1><%="I know you're from " + ucity%></h1>

</body>
</html>