package com.human.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.human.dto.LoginDTO;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response,Object Handler
			, ModelAndView modelAndView) throws Exception{
		
		System.out.println("post..");
		HttpSession session=request.getSession();
		ModelMap modelMap=modelAndView.getModelMap();
		Object loginDTO=modelMap.get("loginDTO");
		System.out.println((LoginDTO)loginDTO);
		if(loginDTO!=null) {
			session.setAttribute("login", loginDTO);
		}	
		
	}
	@Override
	public boolean preHandle(HttpServletRequest request,
		HttpServletResponse response,Object handler) throws Exception{
		HttpSession session=request.getSession();
		if(session.getAttribute("login")!=null) {
			session.removeAttribute("login");			
		}		
		return true;		
	}

}









