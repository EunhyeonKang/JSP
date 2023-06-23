<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	int result = Integer.parseInt(request.getParameter("result"));
	if(result > 0){
	%>
	<h2>수정이 완료되었습니다.</h2>
	<a href="/logout.jsp?id=<%=id %>">로그아웃</a>
	<%}else{%>
		<h2>수정 실패.</h2>
	<%} %>
</body>
</html>