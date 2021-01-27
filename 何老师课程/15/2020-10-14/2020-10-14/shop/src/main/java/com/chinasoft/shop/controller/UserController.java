package com.chinasoft.shop.controller;


import com.chinasoft.shop.dao.UserMapper;
import com.chinasoft.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class UserController extends  BaseController {

    @Autowired
    private IUserService userService;

    //判断用户是否存在
    @PostMapping("selectUserIsExist")
    @ResponseBody
    public boolean selectUserIsExist(HttpServletRequest request){
        //System.out.println("map"+getParamData(request));
        return userService.selectUserIsExist(getParamData(request));
    }
    //执行注册的功能
    @PostMapping("insertUser")
    public String insertUser(HttpServletRequest request){
       //Map<String,Object> map=getParamData(request);
        return userService.insertUser(getParamData(request),request);
    }

    //执行登录的功能
    @PostMapping("userLogin")
    public String userLogin(HttpServletRequest request,HttpSession session){
        //System.out.println("userLogin");
        Map<String,Object> mapall=getParamData(request);
        return userService.userLogin(mapall,session);
    }

    //根据login方法跳转到登录页面因为登录页面要提示登录失败的错误信息所以这个时候必须得动态的ftl
    @GetMapping("login")
    public String login(HttpServletRequest request){
        return "login";//login.ftl
    }

    //跳转到peoplecenter页面个人中心需要加载动态数据，所以个人中心也得必须改成ftl动态模板格式
    @GetMapping("peoplecenter")
    public String peoplecenter(HttpServletRequest request){

        return "peoplecenter";
    }

    @GetMapping("acceptAddress")
    public String acceptAddress(HttpServletRequest request,HttpSession session){
if(session.getAttribute("user")==null){
    session.setAttribute("msg","你没有经过登录无法编辑收货地址");
    return "redirect:/login";
}else{
    //List<Map<String,Object>> list=userService.queryAddressList(getParamData(request),session);
    request.setAttribute("list",userService.queryAddressList(getParamData(request),session));
    return "address";
}
    }

//    @GetMapping("address1")
//    public String address1(HttpServletRequest request){
//        return "address";
//    }




}
