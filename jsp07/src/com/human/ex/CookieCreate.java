package com.human.ex;

import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.Cookie; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet1")
public class CookieCreate extends HttpServlet {
	private static final long seriaVersionUID = 1L;
	
	public CookieCreate() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		/* 쿠키 생성 작업순서
		 * 1.클라이언트에서 쿠키생성 작업 페이지를 호출
		 * 2.쿠키생성 작업 페이지에서 쿠키를 만듬
		 * 3.response객체에 담아서 클라이언트에 저장
		 * */
		Cookie cookie = new Cookie("name", "psm");
		cookie.setMaxAge(600); //쿠키 사용시간 설정, 600초 동안 쿠키 유지
		//0 삭제, -1 무한대
		response.addCookie(cookie);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println(cookie.getName() + "<br>");
		out.println(cookie.getValue() + "<br>");
		out.println(cookie.getMaxAge() + "<br>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}

}
