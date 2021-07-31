package com.bjpowernode.web;

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

    @RequestMapping("/getUserById")
    public String getUserById(Model model, Integer id) {
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
