package com.chinasoft.ssm.controller;

import com.chinasoft.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.util.*;

@Controller
@RequestMapping("/")
public class UserController extends  BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping("index")
    public ModelAndView index(){
        Map<String,Object> map = new HashMap<String , Object>();
        map.put("list",userService.selectUserList());
        return new ModelAndView("index",map);
    }

    //通过input方法进入到对应的输入分数页面
    @GetMapping("input")
    public String input(){
        return "inputScore";
    }

    @GetMapping("del")
    public String del(@RequestParam("ids") String ids){
        userService.deleteUserByIds(getDelData(ids));
        return "redirect:/index";
    }

    @GetMapping("addUser")
    public String addUser(){
        return "addUser";
    }
    @PostMapping("addUser")
    public String addUser1(HttpServletRequest request){
        userService.insertUser(getParamData(request));
        return "redirect:/index";
    }

    @GetMapping("updataUserA")
    public ModelAndView updataUser(@RequestParam("userId") int ids){
        Map<String,Object> map = new HashMap<String , Object>();
        map.putAll(userService.selectUserById(ids));
        System.out.println(userService.selectUserById(ids).toString());
        return new ModelAndView("updataUser",map);
//        return "updataUser";
    }
    @PostMapping("updataUser")
    public String updataUser1(HttpServletRequest request){
        userService.updateUser(getParamData(request));
        return "redirect:/index";
    }
}
