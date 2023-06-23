package kr.co.jsplec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContext
 */
public class ServletConfigEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletConfig config = getServletConfig();
		String dbId = config.getInitParameter("dbId");
		String dbPwd = config.getInitParameter("dbPwd");
		String dbSid = config.getInitParameter("dbSid");
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
