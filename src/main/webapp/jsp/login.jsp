<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="text" name="id">
	<input type="password" name="paswd">
	<button onclick="getValues()">로그인</button>
</body>
<script type="text/javascript">
  function getValues() {
    var idInput = document.getElementsByName('id')[0];
    var paswdInput = document.getElementsByName('paswd')[0];

    var idValue = idInput.value;
    var paswdValue = paswdInput.value;

    location.href = "loginOk.jsp?id=" + idValue + "&paswd=" + paswdValue;
  }
</script>
</html>