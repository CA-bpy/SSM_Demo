package com.ca_bpy.service.impl;

import com.ca_bpy.dao.IStudentDao;
import com.ca_bpy.domain.Student;
import com.ca_bpy.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * StudentService Interface implementation class
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private IStudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int num = studentDao.insertStudent(student);
        return num;
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.selectStudent();
    }
}
