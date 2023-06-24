<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
<style>
body{
	width:100%;
	text-align: center;
}
</style>
</head>

<body>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
%>
<% 	
	if (id!=null && session != null) { %>
        <h2><%=id %>님이 로그인</h2>
		<a href="modify.jsp?id=<%= id%>&name=<%=name%>">회원정보수정</a><br/>
		<a href="/logout.jsp?id=<%=id %>">로그아웃</a>
<% } else { %>
		<h2>메인페이지</h2>
    	<a href="login.jsp">로그인하기</a><br/>
    	<a href="join.html">회원가입</a>
<% } %>

</body>
</html>