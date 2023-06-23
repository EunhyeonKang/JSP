package kr.co.jsplec.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModifyOk
 */
public class ModifyOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyOk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Connection conn = null;
		PreparedStatement pstmt = null;
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String phone = request.getParameter("phone1");
		
		try {
		    conn = JDBCConnection.getConnection();
		    
		    // SQL 쿼리 작성
		    String sql = "UPDATE member SET pw=?, phone1=? WHERE id=?";
		    
		    // PreparedStatement 생성
		    pstmt = conn.prepareStatement(sql);
		    
		    // PreparedStatement 파라미터 설정
		    pstmt.setString(1, pw);      // pw 변수로 설정
		    pstmt.setString(2, phone);  // phone 변수로 설정
		    pstmt.setString(3, id);
		    // SQL 쿼리 실행
		    int result = pstmt.executeUpdate();
		    
		    if (result > 0) {
		    	RequestDispatcher dispatcher = request.getRequestDispatcher("ModifyResult.jsp?id="+id+"&result="+result);
				dispatcher.forward(request, response);
				return;
		 
		    } else {
		    	RequestDispatcher dispatcher = request.getRequestDispatcher("Modify.jsp?result="+result);
				dispatcher.forward(request, response);
				return;
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (pstmt != null) {
		            pstmt.close();
		        }
		        if (conn != null) {
		            conn.close();
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
		response.sendRedirect("login.html");

	}

}
