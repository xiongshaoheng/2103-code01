package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.Student;
import com.bjpowernode.dubbo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Override
    public Student getStuById(Integer id) {
        Student student = new Student();
        student.setId(1002);
        student.setName("老杨");
        student.setAge(18);
        student.setAddr("中国");
        return student;
    }

    @Override
    public Integer getAllStuCount() {
        return 300000;
    }
}
