<%@page import="java.util.Arrays"%>
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
	// 페이지 지시자 
	int[] iArr = {10,20,30};
	out.println(Arrays.toString(iArr));
%>
</body>
</html>