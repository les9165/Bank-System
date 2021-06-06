<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h3>Subject</h3>
	<form action="subjEnroll.do" method="post" >
		ID:<input type="text" name="id" /> 교과목번호 <br>
		Title:<input type="text" name="name" /> 과목명 <br>
		Of Student:<input type="text" name="count" />학생수 <br>
		Prof:<input type="text" name="prof" />교수명 <br>
		<input type="submit" value="등록" >
	</form>
</body>
</html>