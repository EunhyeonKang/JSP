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
	아이디 : <jsp:getProperty name="member" property="id" /><br/>
	패스워드 : <jsp:getProperty name="member" property="pw" /><br/>
	이름 : <jsp:getProperty name="member" property="name" /><br/>
	이메일 : <jsp:getProperty name="member" property="email" /><br/>
</body>
</html>