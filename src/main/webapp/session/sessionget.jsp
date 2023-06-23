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
		Enumeration<String> enu = session.getAttributeNames();
		
		while(enu.hasMoreElements()) {
			String name = enu.nextElement();
			String value = session.getAttribute(name).toString();
			System.out.println(name+ " "+value);
		}
		if (session.isNew()) {
		    System.out.println("세션 삭제됨");
		} else {
		    System.out.println("세션 유지됨");
		}
	%>
	<a href="sessiondel.jsp">logout</a>
</body>
</html>