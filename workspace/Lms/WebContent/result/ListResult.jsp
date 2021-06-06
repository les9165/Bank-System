<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="java.util.ArrayList" %>
  <%@page import="lms.vo.SubjectVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% ArrayList<SubjectVO> list = (ArrayList<SubjectVO>) request.getAttribute("list");
	if(!list.isEmpty()){ %>
	<table border="1">
		<tr><th>ID</th></tr><th>Name</th><th>학생수</th></tr>
		
		<% for(int i=0; i<list.size();i++){
			SubjectVO subj = list.get(i);
			%>
			
			<tr><td><%=subj.getId() %></td>
				<td><%=subj.getName() %></td>
				<td><%=subj.getCount() %></td>
				<td><%=subj.getProf() %></td>
			</tr>
		<% }
	}else{
		out.print("없음");
	}
		%> 
		
	</table>

	<%@ include file="Menu.jsp" %>
</body>
</html>