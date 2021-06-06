<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${id } : LogOut Success!
	<%
		session.invalidate();
	%>
	<p>
	<a href="/Lms/index.jsp">Home</a>
</body>
</html>