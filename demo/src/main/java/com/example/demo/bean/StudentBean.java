package com.example.demo.bean;

import com.example.demo.RowMapper.StudentRowMapper;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class StudentBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Autowired
    JdbcTemplate jdbcTemplate;

    private List<Student> students;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents(){


        students = jdbcTemplate.query("SELECT * FROM student_tbl", new StudentRowMapper());
        return students;
    }

    public String addStudent() {
        String sql = "INSERT INTO student_tbl (ID, NAME, SURNAME, PHONE, CITY, DISTRICT, DESCRIPTION) VALUES (?, ?, ?,?,?,?,?)";

        jdbcTemplate.update(sql, student.getId(), student.getName(), student.getSurname(), student.getPhone(), student.getCity(),
                student.getDistrict(), student.getDescription());

        return "index";
    }


    public void updateStudent() {
        String sql = "UPDATE student_tbl SET (ID, NAME, SURNAME, PHONE, CITY, DISTRICT, DESCRIPTION) = (?, ?, ?,?,?,?,?) WHERE ID = ?";

        jdbcTemplate.update(sql, student.getId(), student.getName(), student.getSurname(), student.getPhone(), student.getCity(),
                student.getDistrict(), student.getDescription(),student.getId());
    }

    public Student getStudentById(int id) {
        String sql = "SELECT * FROM student_tbl WHERE ID = ?";


        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentRowMapper());

    }

    public void removeStudent() {
        String sql = "DELETE FROM student_tbl WHERE ID = ?";

        jdbcTemplate.update(sql, student.getId());
    }
}
