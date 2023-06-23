<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		
		System.out.println(id+pwd);
		if(!(id.equals("keh") && pwd.equals("1234"))){
			response.sendRedirect("login.jsp");
		}else{
			Cookie cookie = new Cookie(id,pwd);
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
			response.sendRedirect("welcome.jsp");
		}
	%>
</body>
</html>