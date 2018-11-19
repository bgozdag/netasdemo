package com.example.demo.RowMapper;

import com.example.demo.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student>
{
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("ID"));
        student.setName(rs.getString("NAME"));
        student.setSurname(rs.getString("SURNAME"));
        student.setPhone(rs.getInt("PHONE"));
        student.setCity(rs.getString("CITY"));
        student.setDistrict(rs.getString("DISTRICT"));
        student.setDescription(rs.getString("DESCRIPTION"));
        return student;
    }


}
