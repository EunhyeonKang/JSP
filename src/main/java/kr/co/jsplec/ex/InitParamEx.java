package kr.co.jsplec.ex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InitParamEx
 */
public class InitParamEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParamEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String dbId = getServletContext().getInitParameter("dbId");
		String dbPwd = getServletContext().getInitParameter("dbPwd");
		String dbSid = getServletContext().getInitParameter("dbSid");
		System.out.println(dbId + " "+dbPwd+" "+dbSid);
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
	    pw.println("<head>");
	    pw.println("</head>");
	    pw.println("<body>");
	    pw.println("<h1>Hello World!!</h1>");
	    pw.println("<p>dbnm: " + dbId + "</p>");
	    pw.println("<p>dbpwd: " + dbPwd + "</p>");
	    pw.println("<p>path: " + dbSid + "</p>");
        pw.println("</ul>");
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
