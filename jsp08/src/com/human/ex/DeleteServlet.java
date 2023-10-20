package com.human.ex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookies[] = request.getCookies();
		String delName = request.getParameter("delName");
		boolean check = false;
		String name = "";
		String value = "";
		for (int i = 0; i < cookies.length; i++) {
			if (delName.equals(cookies[i].getName())) {
				check = true;
				name = cookies[i].getName();
				value = cookies[i].getValue();
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
				request.setAttribute("name", name);
				request.setAttribute("value", value);
			}
		}
		request.setAttribute("check", check);
		RequestDispatcher dispatcher = request.getRequestDispatcher("delete.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}