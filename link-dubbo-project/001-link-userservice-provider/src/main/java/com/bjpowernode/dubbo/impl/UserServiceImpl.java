package com.bjpowernode.dubbo.impl;

import com.bjpowernode.dubbo.entity.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {



    @Override
    public User findUerById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("老陈");
        user.setAge(18);
        return user;
    }
}
