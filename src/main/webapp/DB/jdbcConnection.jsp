<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection, java.sql.DriverManager,java.sql.PreparedStatement, java.sql.SQLException, java.sql.ResultSet, kr.co.jsplec.ex.JDBCConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;%>
    <%
    try {
    	// 오라클의 JDBC 드라이버 이름
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        // jdbc:oracle:thin:@{호스트 이름}?TNS_ADMIN={Wallet파일 위치경로}
        String url = "jdbc:oracle:thin:@dinkdb_medium?"
        		+ "TNS_ADMIN=/Users/test/Wallet_DinkDB"; 
        String user = "DA2311";
        String passwd = "Data2311";
        // DriverManager를 이용해서 Connection 생성한다.
        conn = DriverManager.getConnection(url, user, passwd);
        System.out.println("연결완료");
  		String sql = "SELECT * FROM member";
        
        // PreparedStatement를 생성하여 SQL 쿼리 실행 준비
        pstmt = conn.prepareStatement(sql);
        
        // SQL 쿼리 실행 및 결과셋 가져오기
        rs = pstmt.executeQuery();
        
        // 결과 처리
        while (rs.next()) {
        	String id = rs.getString("id");
            String pw = rs.getString("pw");
            String name = rs.getString("name");
            String phone = rs.getString("phone");
            
            out.println("ID: " + id + "<br>");
            out.println("Password: " + pw + "<br>");
            out.println("Name: " + name + "<br>");
            out.println("Phone: " + phone + "<br><br>");
        }

    } catch (ClassNotFoundException e) {
        // 드라이버 로드 중 예외가 발생한 경우 처리합니다.
        e.printStackTrace();
    } catch (SQLException e) {
        // 데이터베이스 연결 및 쿼리 실행 중 예외가 발생한 경우 처리합니다.
        e.printStackTrace();
    }
    
    
    %>
</body>
</html>