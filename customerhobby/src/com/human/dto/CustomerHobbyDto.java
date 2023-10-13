package com.human.dto;

import java.util.ArrayList;

import com.human.dto.CustomerHobbysDto;
import com.human.dto.HobbyDto;
import com.human.model.Model;

public class CustomerHobbyDto {

	public static void main(String[] args) {

		ArrayList<CustomerHobbyDto> dtos = customerHobbyService.selectCustomerHobbys();
		model = new Model();
		model.setAttribute("dtos", dtos);
		
		

	}

}
