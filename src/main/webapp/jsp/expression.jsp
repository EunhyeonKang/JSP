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
		//표현 <%=
		int i=10;
		String str = "ABCD";
	%>
	<%!
		private int sum(int x,int y){
			return x+y;
		}
	%>
	<%= i %><br/>
	<%= str %><br/>
	<%= sum(1,10) %><br/>
</body>
</html>