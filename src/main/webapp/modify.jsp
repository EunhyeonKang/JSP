<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="kr.co.jsplec.ex.JDBCConnection"%>
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
<form action="/ModifyOk" method="post">
	아이디 : <input type="text" name="id" value="<%=id%>"readonly/><br/>
	패스워드 : <input type="password" name="pw" /><br/>
	이름 : <input type="text" name="name" value="<%=name%>" readonly/><br/>
	핸드폰1 : <input type="text" name="phone1" /><br/>
	성별 : <input type="radio" name="gender" value="M" readonly>남자
	<input type="radio" name="gender" value="F" readonly>여자<br/>
	<input type="submit" name="submit"/>
	</form>
</body>
</html>