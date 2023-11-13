package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.human.dto.HobbyDto;
import com.human.util.DBConn;

public class HobbyDao {
    // insert
    public void insert(HobbyDto dto) {
        String sql = String.format("insert into hobby values(%d, '%s')", dto.getId(), dto.getHobby());
        DBConn.statementUpdate(sql);
    }

    // select all
    public ArrayList<HobbyDto> selectAll() {
        ArrayList<HobbyDto> resultDtos = new ArrayList<HobbyDto>();
        ResultSet rs = DBConn.statementQuery("select * from hobby order by id");
        try {
            while (rs.next()) {
                resultDtos.add(new HobbyDto(rs.getInt("id"), rs.getString("hobby")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultDtos;
    }

    // select by id and hobby
    public HobbyDto selectOne(int id, String hobby) {
        HobbyDto resultDto = new HobbyDto();
        ResultSet rs = DBConn.statementQuery(String.format("select * from hobby where id=%d and hobby='%s'", id, hobby));
        if (rs != null) {
            try {
                rs.next();
                resultDto = new HobbyDto(rs.getInt("id"), rs.getString("hobby"));
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resultDto;
    }

    // update
    public void update(int id, String beforeHobby, String afterHobby) {
        DBConn.statementUpdate(String.format("update hobby set hobby='%s' where id=%d and hobby='%s'", afterHobby, id, beforeHobby));
    }

    // delete by id and hobby
    public void delete(int id, String hobby) {
        DBConn.statementUpdate(String.format("delete from hobby where id=%d and hobby='%s'", id, hobby));
    }

    // delete by id
    public void delete(int id) {
        DBConn.statementUpdate(String.format("delete from hobby where id=%d", id));
    }

    // select by id
    public ArrayList<HobbyDto> selectId(Integer id) {
        ArrayList<HobbyDto> resultDtos = new ArrayList<HobbyDto>();
        ResultSet rs = DBConn.statementQuery(String.format("select * from hobby where id=%d order by id", id));
        try {
            while (rs.next()) {
                resultDtos.add(new HobbyDto(rs.getInt("id"), rs.getString("hobby")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultDtos;
    }
}
