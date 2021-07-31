package com.bjpowernode.dubbo.service;

import com.bjpowernode.dubbo.model.Student;

public interface StudentService {

    /**
     * 根据id查询返回学生对象
     * @param id
     * @return
     */
    Student getStuById(Integer id);


    /**
     * 返回学生总人数
     * @return
     */
    Integer getAllStuCount();
}
