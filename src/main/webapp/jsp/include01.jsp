<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--이게 보이냐 이게 보이냐고 주석인데 이게 보이냐고  --%>
	<h1>include01 페이지 입니다.</h1>
	<jsp:include page="include02.jsp" flush="true"/>
	<h1>다시 include01.jsp 페이지 입니다.</h1>
</body>
</html>