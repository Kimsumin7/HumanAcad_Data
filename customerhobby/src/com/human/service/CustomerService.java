package com.human.service;

import java.util.ArrayList;

import com.human.dao.CustomerDao;
import com.human.dto.CustomerDto;
import com.human.ex.CustomerHobbyDto;

public class CustomerService {
	private CustomerDao dao = new CustomerDao();
	public ArrayList<CustomerDto> selectAll()
	{
		return dao.selectAll();
	}
	
	public CustomerDto selectId(Integer id)
	{
		return dao.selectId(id);
	}
	
	public void insert(CustomerDto dto)
	{
		dao.insert(dto);
	}
	
	public void updateName(Integer id, String name)
	{
		dao.update(id, name);
	}
	
	public void updateheight(Integer id, double height)
	{
		dao.update(id, height);
	}
	
	public void delete(int id)
	{
		dao.delete(id);
	}

	public ArrayList<CustomerHobbyDto> selectCustomerHobbys() {
		// TODO Auto-generated method stub
		return null;
	}
}
