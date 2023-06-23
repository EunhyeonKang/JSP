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
	String sName = (String)session.getAttribute("name");
	%>
	<h2><%=id%>님이 로그아웃 되었습니다.</h2>
	<% session.invalidate(); %>
	<a href="login.html">로그인</a>
</body>
</html>