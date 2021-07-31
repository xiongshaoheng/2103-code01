package com.bjpowernode.dubbo.web;

import com.bjpowernode.model.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;

    @RequestMapping("/getUserById1")
    public String getUserById1(Model model, Integer id) {
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "userDetail";
    }

    @RequestMapping("/getUserById2")
    public String getUserById2(Model model, Integer id) {
        User user = userService2.getUserById(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
