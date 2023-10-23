package com.human.ex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet
public class SetSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SetSessionServlet() {
		super();
	}

	protected void doGet (HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		session.setAttribute("name", "kim");
		session.setMaxInactiveInterval(600);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>세션 저장 완료: " + session.getMaxInactiveInterval()+"<h1>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost (HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}
	
}
