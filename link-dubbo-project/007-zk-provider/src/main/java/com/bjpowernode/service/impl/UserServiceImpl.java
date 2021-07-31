package com.bjpowernode.service.impl;

import com.bjpowernode.model.User;
import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("老孔");
        user.setAge(18);
        return user;
    }
}
