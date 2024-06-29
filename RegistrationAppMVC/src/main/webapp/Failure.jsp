<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failure</title>
</head>
<body bgcolor='red' style="align-content: center">
	<h1>
		<marquee>Registered Failed</marquee>
	</h1>

	<!-- get some data from session and display them to the client -->
	<%
	String name = (String) session.getAttribute("name");
	%>

	<!-- Print the name received from session -->
	<h2>
		Hey
		<%=name%>, you failed to registered to this web app
	</h2>
</body>
</html>