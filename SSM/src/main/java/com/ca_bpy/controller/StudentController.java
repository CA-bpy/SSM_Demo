package com.ca_bpy.controller;

import com.ca_bpy.domain.Student;
import com.ca_bpy.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
/**
 * Create controller object.
 * Processing user submitted requests.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService service;

    //处理insert
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student) {
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        int num = service.addStudent(student);
        if( num > 0 ) {
            tips = "学生【" + student.getName() + "】注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }

    //处理select
    @RequestMapping("/findStudent.do")
    @ResponseBody
    public List<Student> findStudent() {
        List<Student> studentList = service.findStudent();
        return studentList;
    }
}
