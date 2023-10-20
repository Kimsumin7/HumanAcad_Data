package com.human.ex;

import  java.io.IOException; 
import  javax.servlet.RequestDispatcher; 
import  javax.servlet.ServletException; 
import  javax.servlet.annotation.WebServlet; 
import  javax.servlet.http.HttpServlet; 
import  javax.servlet.http.HttpServletRequest; 
import  javax.servlet.http.HttpServletResponse; 

@WebServlet("/FlowerServlet")
public class FlowerServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public FlowerServlet() {
		super();
	}
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
	}
	

}
