package com.bjpowernode.service.impl;

import com.bjpowernode.model.User;
import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1001);
        user.setName("老何");
        user.setAge(19);
        return user;
    }
}
