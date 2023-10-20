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

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public UpdateServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookies[] = request.getCookies();
		String name = request.getParameter("name");
		String updateValue = request.getParameter("updateValue");
		String value = "";
		for (int i = 0; i < cookies.length; i++) {
			if (name.equals(cookies[i].getName())) {
				value = cookies[i].getValue();
				Cookie cookie = new Cookie(name, updateValue);
				cookie.setMaxAge(600);
				response.addCookie(cookie);
				request.setAttribute("name", name);
				request.setAttribute("value", value);
				request.setAttribute("updateValue", updateValue);
				request.setAttribute("age", 100);
			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("update.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}