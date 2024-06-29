<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='cyan' style="align-content: center">
	<h1>
		<marquee>Registered Successfully!</marquee>
	</h1>

	<!-- get some data from session and display them to the client -->
	<%
	String name = (String) session.getAttribute("name");
	String email = (String) session.getAttribute("email");
	%>

	<!-- Print the name received from session -->
	<h2>
		Hey
		<%=name%>, you have registered successfully to this web app
	</h2>



</body>
</html>