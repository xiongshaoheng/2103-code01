package com.bjpowernode.service.impl;

import com.bjpowernode.model.User;
import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {
    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1002);
        user.setName("老刘");
        user.setAge(88);
        return user;
    }
}
