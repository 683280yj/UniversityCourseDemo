package com.chinasoft.shop.controller;


import com.chinasoft.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String insertUser(HttpServletRequest request){
        System.out.println("----------insertUser----------");
        return userService.insertUser(getParamData(request),request);
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("userLogin")
    public String userLogin(HttpServletRequest request,HttpSession session){
        Map<String,Object> map=getParamData(request);
//        System.out.println("userLogin="+map);
        return userService.userLogin(map,session);
    }

    @GetMapping("peoplecenter")
    public String peoplecenter(HttpServletRequest request){
        return "peoplecenter";
    }

//    @GetMapping("address1")
//    public String address1(HttpServletRequest request){
//        return "address";
//    }

    @GetMapping("acceptaddress")
    public String address(HttpServletRequest request,HttpSession session){
        if(session.getAttribute("user")==null){
            session.setAttribute("msg","您为经过登陆无法进行编辑");
            return "redirect:/login";
        }else{
//            List<Map<String,Object>> list=userService.queryAddressList(getParamData(request),session);
//            System.out.println(list);
            request.setAttribute("list",userService.queryAddressList(getParamData(request),session));
            return "address";
        }
    }

    @GetMapping("updateUserAddress")
    public String updateUserAddressOne(HttpServletRequest request){
        int count=userService.updateUserAddress(getParamData(request));
        System.out.println(count);
        return "redirect:/acceptaddress";
    }

    @GetMapping("del")
    public String del(HttpServletRequest request) {
        int id = userService.deleteUserAddress(getParamData(request));
        System.out.println("id" + id);
        return "redirect:/acceptaddress";
    }

    @PostMapping("loadArea")
    @ResponseBody
    public String loadArea(HttpServletRequest request){
        return userService.selectAreaList();
    }

    @GetMapping("main")
    public String main(){
        return "main";
    }

    @GetMapping("insertProduct")
    public String insertProduct(){
        return "product";
    }

    @PostMapping("insertProduct")
    public String insertProduct1(@RequestParam("attr") MultipartFile file, HttpServletRequest request,HttpSession session){
        String url=null;
        Map<String,Object> map=new HashMap<String,Object>();
        try {
            url=upload(file);
            map=getParamData(request);
        }catch (Exception e){
        }
        System.out.println("url:"+url);
        System.out.println("map:"+map);
        return "redirect:/insertProduct";
    }
}
