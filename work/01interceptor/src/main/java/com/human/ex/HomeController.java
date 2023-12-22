package com.human.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.dto.LoginDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String start(Locale locale, Model model) {
		System.out.println("startPage");
		
		return "start";
	}
	@RequestMapping(value = "/end", method = RequestMethod.GET)
	public String end(Locale locale, Model model) {
		System.out.println("endPage");
		model.addAttribute("result","endData");
		return "end";
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String result(Locale locale, Model model) {
		System.out.println("resultPage");
		return "result";
	}
	
	
	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("dto") LoginDTO dto) {
		
		return "/user/login";
	}
	@RequestMapping(value = "/user/loginpost", method = RequestMethod.POST)
	public String loginpost(LoginDTO dto,HttpSession session,Model model) {
		model.addAttribute("loginDTO",dto);
				
		return "/user/loginpost";
	}
	@RequestMapping(value = "/user/logout", method = RequestMethod.GET)
	public String logout(@ModelAttribute("dto") LoginDTO dto,HttpSession session) {
		
		Object obj=session.getAttribute("login");
		if(obj!=null) {
			session.removeAttribute("login");
			session.invalidate();
		}
		return "/user/logout";
	}
	
}















