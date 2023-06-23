package kr.co.member.ex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class JoinResult
 */
public class JoinResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	    response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html>");
	    pw.println("<head>");
	    pw.println("</head>");
	    pw.println("<body>");
	    pw.println("<h2>"+id+"회원님이 가입했습니다.</h2>");
	    pw.println("<a href='/login.html'>로그인하기</a>");
	    pw.println("</body>");
	    pw.println("</html>");
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
