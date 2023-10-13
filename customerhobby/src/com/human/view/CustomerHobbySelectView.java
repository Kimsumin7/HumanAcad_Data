package com.human.view;

import java.util.ArrayList;

import com.human.dto.CustomerHobbyDto;
import com.human.model.Model;

public class CustomerHobbySelectView {

	public static void main(String[] args) {
		Model model = null;
		ArrayList<CustomerHobbyDto> dtos = (ArrayList<CustomerHobbyDto>)model.getAttribute("dtos");
		
		System.out.println("==========select==========");
		for (CustomerHobbyDto dto:dtos) {
			System.out.println(dto);
			
		}

	}

}
