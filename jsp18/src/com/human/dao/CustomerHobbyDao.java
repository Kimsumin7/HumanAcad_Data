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

public class CustomerHobbyDao {
    public ArrayList<CustomerHobbyDto> selecAllCustomerAndHobby() {
        ArrayList<CustomerHobbyDto> resultDtos = new ArrayList<CustomerHobbyDto>();
        ResultSet rs = DBConn.statementQuery("select customer.*, hobby.hobby from customer, hobby " +
                "where customer.id=hobby.id(+)");

        try {
            while (rs.next()) {
                resultDtos.add(new CustomerHobbyDto(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("height"),
                        rs.getTimestamp("birthday").toLocalDateTime(),
                        new HobbyDto(rs.getInt("id"), rs.getString("hobby"))
                    )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultDtos;
    }

    public CustomerHobbyDto selectOneCustomerAndHobby(int id, String hobby) {
        CustomerHobbyDto resultDto = null;
        String sql = "select customer.*, hobby.hobby from customer, hobby " +
            "where customer.id=hobby.id(+) and customer.id=" + id + " and hobby.hobby is null";

        if (!hobby.isEmpty()) {
            sql = "select customer.*, hobby.hobby from customer, hobby " +
                "where customer.id=hobby.id(+) and customer.id=" + id + " and hobby.hobby='" + hobby + "'";
        }

        ResultSet rs = DBConn.statementQuery(sql);

        try {
            while (rs.next()) {
                resultDto = new CustomerHobbyDto(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("height"),
                        rs.getTimestamp("birthday").toLocalDateTime(),
                        new HobbyDto(rs.getInt("id"), rs.getString("hobby"))
                    );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultDto;
    }
}
