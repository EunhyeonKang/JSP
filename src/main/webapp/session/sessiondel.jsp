<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.invalidate();
		
		out.println("로그아웃완료");
		
		if (session == null || !request.isRequestedSessionIdValid()) {
		    System.out.println("세션이 무효화 상태입니다.");
		}
		response.sendRedirect("sessionex.jsp");
	%>
</body>
</html>