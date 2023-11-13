package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.human.dto.CustomerDto;
import com.human.dto.CustomerHobbyDto;
import com.human.dto.HobbyDto;
import com.human.util.DBConn;


public class CustomerDao {
	
	public void init() {
		// 1번데이터
		CustomerDto dto = new CustomerDto(null, "홍길동1", 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00"
						, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		String sql = String.format(
				"insert into customer values(id_counter.nextval,'%s',%f,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getHeight(),
				dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		// 2번데이터
		dto = new CustomerDto(null, "홍길동2", 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00"
						, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		// to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))
		sql = String.format(
				"insert into customer values(id_counter.nextval,'%s',%f,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getHeight(),
				dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		// 3번데이터
		dto = new CustomerDto(null, "홍길동3", 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		sql = String.format(
			"insert into customer values(id_counter.nextval,'%s',%f,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getHeight(),
				dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
	}
	//crud작업
	//insert작업
	public void insert(CustomerDto dto) {
		String sql = String.format(
				"insert into customer values(id_counter.nextval,'%s',%f,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
					dto.getName(), dto.getHeight(),
					dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			DBConn.statementUpdate(sql);
	}
	// select 작업
	public ArrayList<CustomerDto> selectAll() {
		ArrayList<CustomerDto> resultDtos = new ArrayList<CustomerDto>();

		ResultSet rs = DBConn.statementQuery(String.format("select * from customer"));

		try {
			while (rs.next()) {
				resultDtos.add(new CustomerDto(rs.getInt("id"), rs.getString("name"),
						rs.getDouble("height"),
						rs.getTimestamp("birthday").toLocalDateTime()));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultDtos;
	}
	// select 작업
	public CustomerDto selectId(int id) {
		CustomerDto resultDtos = new CustomerDto();

		ResultSet rs = DBConn.statementQuery(String.format("select * from customer where id=%d",id));
		if(rs!=null) {		
			try {
				rs.next();
				resultDtos=new CustomerDto(rs.getInt("id"), rs.getString("name"),
						rs.getDouble("height"),
						rs.getTimestamp("birthday").toLocalDateTime());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return resultDtos;
	}

	// update작업
	public void update(int id, String name) {
		// update 이름을 이용해서 나이를 변경하는 형태
		DBConn.statementUpdate(String.format("update customer set name='%s' where id=%d", name,id));
	}

	//  delete작업
	public void delete(int id) {
		DBConn.statementUpdate(String.format("delete customer where id = %d", id));
	}
	public ArrayList<Integer> getIds() {
		ArrayList<Integer> ids=new ArrayList<Integer>();
		
		ResultSet rs = DBConn.statementQuery(String.format("select * from customer"));
		try {
			while (rs.next()) {
				ids.add(rs.getInt("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ids;
	}
	
	//CustomerHobby 작업으로 생긴 부분 
	public int getMaxId() {
		int maxIdValue=-1;

		ResultSet rs = DBConn.statementQuery(String.format("select max(id) as maxId from customer"));
		if(rs!=null) {		
			try {
				rs.next();
				maxIdValue=rs.getInt("maxId");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return maxIdValue;
	}
	
	public void update(int id, double height) {
		DBConn.statementUpdate(String.format("update customer set height=%f where id=%d", height,id));
	}
	

	
}