package com.chinasoft.ssm.controller;

import com.chinasoft.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//@RestController
@Controller
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
    //请求的三种写法
//  @GetMapping("index")
//  @PostMapping("index")
//  @RequestMapping("/index")//默认为Get请求
//  @RequestMapping(value="index" , method = RequestMethod.POST)

//    public String index(HttpServletRequest request, HttpSession session){
//    System.out.println("list"+userService.selectUserList());
//    return userService.selectUserList().toString();
//        request.setAttribute("username","cmr");
//        session.setAttribute("password","0901");
//  }
//    @GetMapping("index")
//  @PostMapping("index")
    @RequestMapping("index")
    public ModelAndView index(@RequestParam("score") String[] score){
        System.out.println(Arrays.toString(score));
        Map<String,Object> map = new HashMap<String , Object>();
        //map.put("username","cmr");
        map.put("list",userService.selectUserList());
        map.put("score",score);
        return new ModelAndView("index",map);
    }

//    @RequestMapping("/index1")
//    public String index1(){
//        return "redirect:/index";
//    }

    //通过input方法进入到对应的输入分数页面
    @GetMapping("input")
    public String input(){
        return "inputScore";
    }
}
