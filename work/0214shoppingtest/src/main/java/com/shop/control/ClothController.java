package com.shop.control;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.control.HomeController;
import com.shop.vo.PageMaker;
import com.shop.service.ProductService;

@Controller
public class ClothController {

	private static final Logger logger = LoggerFactory.getLogger(ClothController.class);

	@Inject
	private ProductService service;

	@RequestMapping(value = "/cloth", method = RequestMethod.GET)
	public void listAll(PageMaker pm,Model model) throws Exception {
		
		  pm.setProductkind("cloth");
		  model.addAttribute("list", service.listAll());
		  model.addAttribute("ProductBestSales", service.ProductBestSales(pm));
		  model.addAttribute("list",service.listSearchCriteria(pm));
		  pm.setTotalCount(service.listSearchCount(pm));
		  
		
	}	

}
