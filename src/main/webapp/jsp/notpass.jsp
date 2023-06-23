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
	String a = request.getParameter("age");
	int age = Integer.parseInt(a);
	%>
	<h2>당신의 나이는 <%=age %>로 미성년자입니다.</h2>
	<a href="ageinfo.html">처음으로</a>
</body>
</html>