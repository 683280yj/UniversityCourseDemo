package com.chinasoft.web.controller;

import com.chinasoft.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;

    @RequestMapping("success")
    public String success(){
        return "success";
    }

    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("login1")
    public ModelAndView login1(@RequestParam("userName") String userName, @RequestParam("userPwd") String userPwd){
        Map<String,Object> map=new HashMap<String,Object>();
        HashMap list = userService.selectUserLogin(userName,userPwd);
        if (list==null){
            map.put("error","账号或密码错误!");
            return new ModelAndView("login",map);
        }else {
            map.put("list",userService.selectLogin(userName,userPwd));
            return new ModelAndView("index",map);
        }
    }

    @RequestMapping("reg")
    public String reg1(HttpServletRequest request){
        userService.insertReg(getParamData(request));
        return "redirect:/success";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("UserInfo")
    public String UserInfo(){
        return "UserInfo";
    }

    @RequestMapping("selectUserInfo")
    public ModelAndView SelectUserInfo(@RequestParam("userName") String userName, @RequestParam("userPwd") String userPwd){
        ModelMap model = new ModelMap();
        model.addAttribute("address",userService.selectUserById(userName,userPwd));
        model.addAttribute("nick",userService.selectLogin(userName,userPwd));
        ModelAndView modelAndView = new ModelAndView("UserInfo",model);
        return modelAndView;
    }

    @RequestMapping("del")
    public String del(@RequestParam("addId") int addId){
        System.out.println("删除ID:"+addId);
        userService.deleteUserByIds(addId);
        return "redirect:/UserInfo";
    }
}
