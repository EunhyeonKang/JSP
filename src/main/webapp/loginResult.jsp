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
	String name = request.getParameter("name");
%>
<h2><%=id %>님이 로그인했습니다.</h2>
<a href="modify.jsp?id=<%= id%>&name=<%=name%>">회원정보수정</a>
</body>
</html>