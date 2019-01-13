package com.eric.house.demo.controller;


import com.eric.house.dao.model.User;
import com.eric.house.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018-5-24.
 */
@RestController
public class TestController {
    @Resource
    private UserService userService;

    @RequestMapping("/helloWorld")
    @ResponseBody
    public String helloWorld(){
        System.out.println("进入");
        return "helloWorld";
    }

    @RequestMapping("/add")
    @ResponseBody
    public int addUser(){
        User user= new User();

        return userService.insert(user);
    }
}
