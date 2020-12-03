package com.ca_bpy.dao;

import com.ca_bpy.domain.Student;

import java.util.List;
/**
 * Persistence layer interface
 * Define the method of operating database.
 **/
public interface IStudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
