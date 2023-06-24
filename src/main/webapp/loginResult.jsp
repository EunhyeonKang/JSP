<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
<style>
body{
	width:100%;
	text-align: center;
}
</style>
</head>
<script type="text/javascript">
        // JavaScript 코드에서 파라미터 값을 받아와서 alert 창을 띄움
        var id = '<%= request.getParameter("id") %>';
        var name = '<%= request.getParameter("name") %>';
        
        var message = id+ "님 로그인 성공!";
        alert(message);
        
        // 원하는 동작 수행 (예: 페이지 이동)
        window.location.href = "main.jsp?id="+id+"&name="+name;
</script>
<body>
</body>
</html>