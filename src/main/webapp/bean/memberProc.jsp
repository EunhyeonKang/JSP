<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:useBean id="member" class="kr.co.jsplec.ex.MemberBean" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
	%>

	<jsp:setProperty name="member" property="id" value="<%=id %>" />
	<jsp:setProperty name="member" property="pw" value="<%=pw %>" />
	<jsp:setProperty name="member" property="name" value="<%=name %>" />
	<jsp:setProperty name="member" property="email" value="<%=email %>" />
	<a href="memberConfirm.jsp">확인</a>
</body>
</html>