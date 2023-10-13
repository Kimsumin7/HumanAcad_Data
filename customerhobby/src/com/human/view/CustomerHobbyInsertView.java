package com.human.view;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.human.dto.CustomerDto;
import com.human.dto.HobbyDto;
import com.human.model.Model;
import com.human.util.UserInput;

public class CustomerHobbyInsertView implements ViewInterface {

	@Override
	                     //하비 정보를 모델에 담음
	public void execute(Model model) {

		//고객 정보 등록
		System.out.println("고객 입력>>");
		CustomerDto customerDto = new CustomerDto(null, UserInput.inputString("name"), UserInput.inputDouble("height"),
				UserInput.inputLocalDateTime("birthday"));
		model.setAttribute("customerDto", customerDto);

		ArrayList<HobbyDto> hobbyDtos = new ArrayList<HobbyDto>();
		//하비가 있으면 hobbyDtos에 지속적으로 추가
		while (UserInput.inputString("하비가 없으면 0, 있으면 1").equals("1")) {
			System.out.println("하비 입력>>");
			hobbyDtos.add(new HobbyDto(null, UserInput.inputString("hobby")));
		}
		model.setAttribute("hobbyDtos", hobbyDtos);

	}

}
