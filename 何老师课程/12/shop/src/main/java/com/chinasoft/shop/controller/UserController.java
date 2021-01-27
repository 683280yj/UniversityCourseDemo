package com.chinasoft.shop.controller;


import com.chinasoft.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;

    @PostMapping("selectUserIsExist")
    @ResponseBody
    public boolean selectUserIsExist(HttpServletRequest request){
        return userService.selectUserIsExist(getParamData(request));
    }
    @PostMapping("insertUser")
    public String insertUser(){
        System.out.println("----------hello----------");
        return null;
    }
}
