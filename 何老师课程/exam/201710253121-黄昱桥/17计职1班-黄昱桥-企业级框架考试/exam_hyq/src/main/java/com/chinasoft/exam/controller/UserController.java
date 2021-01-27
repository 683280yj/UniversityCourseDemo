package com.chinasoft.exam.controller;

import com.chinasoft.exam.domain.Profile;
import com.chinasoft.exam.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class UserController extends BaseController{
    @Autowired
    private IUserService userService;

    //查询所有
    @RequestMapping("/index")
    public ModelAndView index(){
        Map<String,Object> map = new HashMap<String , Object>();
        map.put("list",userService.getAll());
        return new ModelAndView("index",map);
    }
    //查询详细
    @RequestMapping("UserDeta")
    public String get(@RequestParam("profileId") int id){
        userService.selectUserById(id);
        return "redirect:/UserDeta";
    }

    //更新
    @GetMapping("Userupdate")
    public ModelAndView updataUser(@RequestParam("profileId") int id){
        Map<String,Object> map = new HashMap<String , Object>();
        map.putAll(userService.selectUserById(id));
        System.out.println(userService.get(id).toString());
        return new ModelAndView("Userupdate",map);
    }
    @PostMapping("Userupdate")
    public String updataUser1(HttpServletRequest request){
        userService.update((Profile) getParamData(request));
        return "redirect:/index";
    }
}
