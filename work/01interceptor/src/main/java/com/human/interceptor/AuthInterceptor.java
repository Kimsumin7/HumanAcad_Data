package com.human.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response,Object Handler
			, ModelAndView modelAndView) throws Exception{
		
		System.out.println("post..");
		
		
	}
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,Object handler) throws Exception{
		System.out.println("pre..");
		HttpSession session=request.getSession();
		if(session.getAttribute("login")==null) {
			response.sendRedirect("/ex/user/login");
			return false;
		}
		return true;		
	}

}









