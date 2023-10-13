package com.human.service;

import java.util.ArrayList;

import com.human.dao.CustomerDao;
import com.human.dao.HobbyDao;
import com.human.dto.CustomerDto;
import com.human.dto.HobbyDto;

public class CustomerHobbyService {
	CustomerDao customerDao =new CustomerDao();
	HobbyDao hobbyDao=new HobbyDao();
	
	
	public void insertCustomerHobby(CustomerDto customerDto,ArrayList<HobbyDto> hobbyDtos) {

		//
		customerDao.insert(customerDto);
//		hobbyService.insert(hobbyDtos.get(0));
//		hobbyService.insert(hobbyDtos.get(1));
//		for(int i=0;i<hobbyDtos.size();i++) {			
//		}
		//하비는 여러개 입력할 수도 있고 하나만 입력할 수도 있음 그래서 for로 반복문 돌림
		for(HobbyDto item:hobbyDtos) {
			item.setId(customerDao.getMaxId());
			hobbyDao.insert(item);
		}
	}
	
	
	public void selectCustomerHobbys1() {
		
	}
	
	public void ArrayList<CustomerHobbyDto> ArrayList<CustomerHobbyDto> selectCustomerHobbys(){
		Object chDao;
		ArrayList<CustomerHobbyDto> dtos = ((Object) chDao).select();
		
		return dtos;
		
		
	}

}
