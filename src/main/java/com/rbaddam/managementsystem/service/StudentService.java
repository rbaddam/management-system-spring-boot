package com.rbaddam.managementsystem.service;

import com.rbaddam.managementsystem.entity.Student;

import java.util.List;


public interface StudentService {

    List<Student>  getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(Long id);

    Student updateStudent(Student student);

    void deleteStudent(Long id);

}
