package com.chinasoft.shop.controller;


import com.chinasoft.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("index")
    public String index(){
        System.out.println(userService.selectUserList().toString());
        return "index";
    }
}
