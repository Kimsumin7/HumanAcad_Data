package com.human.ex;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

import com.human.dto.CustomerDto;
import com.human.dto.HobbyDto;
import com.human.model.Model;
import com.human.service.CustomerHobbyService;
import com.human.service.CustomerService;
import com.human.service.HobbyService;
import com.human.view.CustomerHobbyInsertView;

public class CustomerHobbyEx {
	public static CustomerService customerService = new CustomerService();
	public static HobbyService hobbyService = new HobbyService();

	public static CustomerHobbyService customerHobbyService = new CustomerHobbyService();

	public static void main(String[] args) {
		Model model = new Model();
		com.human.view.ViewInterface view = null;

		System.out.println("Start");
		// customer hobby 입력

		// 신규 고객 하비 추가
		// 1 A,B

		model = new Model();
		view = new CustomerHobbyInsertView();
		view.execute(model);
                                                 //customerDto, hobbyDtos db에 넣어야 함
		customerHobbyService.insertCustomerHobby((CustomerDto) model.getAttribute("customerDto"),
				(ArrayList<HobbyDto>) model.getAttribute("hobbyDtos"));
//		customerHobbyService.insertCustomerHobby(customerDto, hobbyDtos);

//		
//		customerService.insert(customerDto);
//		hobbyService.insert(hobbyDtos.get(0));
//		hobbyService.insert(hobbyDtos.get(1));

		
		//select
		ArrayList<CustomerHobbyDto> dtos = customerService.selectCustomerHobbys();
		model = new Mode();
		model.setAttribute("dtos", dtos);
		view = new CustomerHobbysSelectView();
		view.execute(model);
		
		
		
		// 고객 따로 입력
		// hobby 따로 입력
//		
//		
//		  id number,
//		  name VARCHAR(255),
//		  height number,
//		  birthday DATE
//		  
//		  hobby VARCHAR(255)

	}

}
