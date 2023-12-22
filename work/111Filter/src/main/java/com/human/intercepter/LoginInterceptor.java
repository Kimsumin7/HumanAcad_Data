package com.human.intercepter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	 
	@Override
	 public void postHandle(HttpServletRequest request,
	 HttpServletResponse response, Object handler,
	 ModelAndView modelAndView) throws Exception {
		System.out.println("test");
	 HttpSession session = request.getSession();
	
	 ModelMap modelMap = modelAndView.getModelMap();
	 Object userVO = modelMap.get("userVO");
	
	 if(userVO != null){
	
		 System.out.println("success login");
		 session.setAttribute("login", userVO);
		 //response.sendRedirect("/");

	      if (request.getParameter("useCookie") != null) {

	    	  System.out.println("remember me................");
	        Cookie loginCookie = new Cookie("loginCookie", session.getId());
	        loginCookie.setPath("/");
	        loginCookie.setMaxAge(60 * 60 * 24 * 7);
	        response.addCookie(loginCookie);
	      }else {
	    	  System.out.println("?remember me................");
	      }
	 Object dest = session.getAttribute("dest");
	
	 response.sendRedirect(dest != null ? (String)dest:"/");
	 }
	 }

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

	HttpSession session = request.getSession();

	if (session.getAttribute("login") != null) {
	System.out.println("clear login data before");
	session.removeAttribute("login");
	}

	return true;
	}
}


