package com.example.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements  RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        // throw new UnsupportedOperationException("Not supported yet.");
        // return null;

        Student std = new Student();
        std.setMarks(rs.getFloat("std_marks"));
        std.setName(rs.getString("std_name"));
        std.setRollno(rs.getInt("std_roll"));
        return std; 

    }
    
}
