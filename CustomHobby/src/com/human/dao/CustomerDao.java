package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.human.dto.CustomerDto;
import com.human.util.DBConn;

public class CustomerDao {

	public void init() {
		CustomerDto dto = new CustomerDto(null, "홍길동1", 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		String sql = String.format(
				"insert into customer values(id_counter.nextval,'%s',%f,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getHeight(),
				dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		// 2번데이터
		dto = new CustomerDto(null, "홍길동2", 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
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
	///////////////////////////////////
	
	//Crud작업
	
	// 1. insert 작업
	public void insert(CustomerDto dto) {
	    String sql = String.format("insert into customer values(id_counter.nextval, '%s', %f, to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
	            dto.getName(),
	            dto.getHeight(),
	            dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
	    );
	}

	// 2. select 작업
	// selectAll
	public ArrayList<CustomerDto> selectAll() {
	    ArrayList<CustomerDto> resultDtos = new ArrayList<CustomerDto>();

	    ResultSet rs = DBConn.statementQuery(String.format("select * from customer"));

	    try {
	        while (rs.next()) {
	            resultDtos.add(new CustomerDto(rs.getInt("id"),
	                    rs.getString("name"),
	                    rs.getDouble("height"),
	                    rs.getTimestamp("birthday").toLocalDateTime()
	            ));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return resultDtos;
	}
	//selectOne
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
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return resultDtos;
	}
	//update작업
	public void update(int id, String name) {
		DBConn.statementUpdate(String.format("update customer set name=%d", name, id));
	}
	//delete작업(id삭제)
	public void delete(int id) {
		DBConn.statementUpdate(String.format("delete customer where id=%d", id));
	}
}

