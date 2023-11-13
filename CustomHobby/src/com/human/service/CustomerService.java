package com.human.service;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.dao.CustomerDao;
import com.human.dto.CustomerDto;

public class CustomerService {
	public static CustomerDao customerDao = new CustomerDao();
	
	public static void insertDB(HttpServletRequest request, HttpServletResponse response) {
		CustomerDto dto = new CustomerDto(null, request.getParmeter("name"),
				Double.parseDouble(request.getParameter("height")),
				LocalDateTime.parse(request.getParameter("birthday"))
				);
		System.out.println(dto);
		customerDao.insert(dto);
	}
	public static void select

}
