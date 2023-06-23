package kr.co.member.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.co.member.ex.model.MemberDTO;
import kr.co.member.ex.model.MemberDAO;

/**
 * Servlet implementation class loginOk
 */
public class LoginOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginOk() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		try {
			MemberDAO mt = new MemberDAO();
			MemberDTO md = mt.LoginOk(id);
			if (md == null) {
				out.println("<h2>조회실패</h2>");
			} else {
				if (id.equals(md.getId()) && pw.equals(md.getPw())) {
					HttpSession session = request.getSession(true);
					session.setAttribute("id", md.getId());
					session.setAttribute("name", md.getName());

					//System.out.println("login success");
					RequestDispatcher dispatcher = request
							.getRequestDispatcher("loginResult.jsp?id=" + md.getId() + "&name=" + md.getName());
					dispatcher.forward(request, response);
					return;
				} else {
					//System.out.println("login fail");
					RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
					dispatcher.forward(request, response);
					return;
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.sendRedirect("join.html");
		}
	}

}
