package com.chinasoft.ssm.controller;

import com.chinasoft.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/")
public class UserController {
//    @Autowired
//    private DataSource dataSource;
//
//    @RequestMapping("/index")
//    public String index(){
//        System.out.println(dataSource);
//        return "hello";
//    }

    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public String index(){
        //System.out.println("list"+userService.selectUserList());
        return userService.selectUserList().toString();
    }
}
