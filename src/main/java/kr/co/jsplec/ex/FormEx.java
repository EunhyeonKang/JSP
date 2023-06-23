package kr.co.jsplec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String paswd = request.getParameter("paswd");
		String[] hobbies = request.getParameterValues("hobby");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		
		pw.println("<html>");
	    pw.println("<head>");
	    pw.println("</head>");
	    pw.println("<body>");
	    pw.println("<h1>Hello World!!</h1>");
	    pw.println("<p>Name: " + name + "</p>");
	    pw.println("<p>ID: " + id + "</p>");
	    pw.println("<p>Password: " + paswd + "</p>");
	    pw.println("<p>Hobby:</p>");
        pw.println("<ul>");
        if (hobbies != null) {
            for (String hobby : hobbies) {
                pw.println("<li>" + hobby + "</li>");
            }
        }
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
