package com.human.ex;

import  java.io.IOException; 
import  java.io.PrintWriter; 
import  javax.servlet.RequestDispatcher; 
import  javax.servlet.ServletException; 
import  javax.servlet.annotation.WebServlet; 
import  javax.servlet.http.Cookie; 
import  javax.servlet.http.HttpServlet; 
import  javax.servlet.http.HttpServletRequest; 
import  javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public CreateServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		String vlaue = request.getParameter("value");
		Cookie cookie = new Cookie(name, vlaue);
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		request.setAttribute("name", cookie.getName());
		request.setAttribute("value", cookie.getValue());
		request.setAttribute("age", cookie.getMaxAge());
		RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}
