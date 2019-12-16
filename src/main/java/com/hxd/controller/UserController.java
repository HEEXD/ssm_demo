package com.hxd.controller;

import com.hxd.entity.User;
import com.hxd.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<User> all = userService.findAll();
        model.addAttribute("list", all);
        return "hello";
    }

}
