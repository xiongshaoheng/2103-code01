package com.bjpowernode.dubbo.web;

import com.bjpowernode.dubbo.entity.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserById")
    public String getUserById(Model model,Integer id) {
        System.out.println("id:" + id);
        User user = userService.findUerById(id);

        model.addAttribute("user",user);

        return "userDetail";
    }
}
