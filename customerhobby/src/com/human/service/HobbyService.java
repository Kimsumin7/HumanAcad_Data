package com.human.service;

import java.util.ArrayList;

import com.human.dao.HobbyDao;
import com.human.dto.HobbyDto;

public class HobbyService 
{
	private HobbyDao dao = new HobbyDao();
	public ArrayList<HobbyDto> selectAll()
	{
		return dao.selectAll();
	}
	
	public HobbyDto selectOne(int id, String hobby)
	{
		return dao.selectOne(id, hobby);
	}
	
	public void insert(HobbyDto dto)
	{
		dao.insert(dto);
	}
	
	public void update(int id, String beforehobby, String afterhobby)
	{
		dao.update(id, beforehobby, afterhobby);
	}
	
	public void delete(int id, String hobby)
	{
		dao.delete(id, hobby);
	}
}
