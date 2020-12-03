package com.ca_bpy.service;

import com.ca_bpy.domain.Student;

import java.util.List;
/**
 * StudentService interface
 * Define the method of operating database.
 **/
public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudent();
}
