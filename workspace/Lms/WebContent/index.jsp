<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>YongIn LMS</h3>
	<form action="login.do" method="post" >
		ID:<input type="text" name="id" /><br>
		Password:<input type="text" name="password" /><br>
		<input type="radio" name="option" value="professor">교수
		<input type="radio" name="option" value="student"  > 학생
		<input type="submit" value="login" >
	</form>



</body>
</html>