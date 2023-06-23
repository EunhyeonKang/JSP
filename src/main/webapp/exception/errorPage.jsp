<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page isErrorPage="true" %>
<%
	// 에러가 맞다!!
	response.setStatus(200);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	예외 유형 : <%exception.getClass().getName(); %>
	에러 메시지 : <%exception.getMessage(); %> 
	예외 유형 및 메시지 <%=exception.toString() %>
</body>
</html>