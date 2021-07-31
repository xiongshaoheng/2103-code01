package com.bjpowernode.dubbo.web;

import com.bjpowernode.dubbo.model.Student;
import com.bjpowernode.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStuById")
    public String getStuById(Model model,Integer id) {
        Student student = studentService.getStuById(id);
        model.addAttribute("student",student);
        return "stuDetail";
    }

    @RequestMapping("/getAllStuCount")
    public String getAllStuCount(Model model) {
        Integer count  = studentService.getAllStuCount();
        model.addAttribute("count",count);
        return "stuCount";
    }

}
