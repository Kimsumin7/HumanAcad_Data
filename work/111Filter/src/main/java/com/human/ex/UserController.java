package com.human.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	  public void loginGET(@ModelAttribute("dto") LoginDTO dto) {

	  }

	  @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	  public void loginPOST(LoginDTO dto, HttpSession session, Model model) throws Exception {

	    UserVO vo = new UserVO();

	    if (vo == null) {
	      return;
	    }

	    model.addAttribute("userVO", vo);

	    if (dto.isUseCookie()) {

	      int amount = 60 * 60 * 24 * 7;

	      Date sessionLimit = new Date(System.currentTimeMillis() + (1000 * amount));

	     
	    }

	  }

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		int a=5/0;
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}















