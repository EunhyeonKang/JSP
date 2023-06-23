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
	<%!
		String id,pwd;
	%>
	<%
		id = request.getParameter("id");
		pwd = request.getParameter("paswd");
		
		if(!(id.equals("keh") && pwd.equals("1234"))){
			response.sendRedirect("sessionex.jsp");
		}else{
	        session.setAttribute("id", id);
	       	session.setMaxInactiveInterval(60*60);
			response.sendRedirect("sessionget.jsp");
		}
	%>
</body>
</html>