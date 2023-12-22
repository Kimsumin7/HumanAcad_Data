package com.human.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.service.HumanService;


@Controller
public class HomeController {
	
	@Autowired
	private HumanService service;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String list(Model model) throws Exception{
		
		model.addAttribute("list", service.search());
		
		return "list";
	}
	
}
