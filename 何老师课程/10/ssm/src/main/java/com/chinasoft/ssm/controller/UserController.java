package com.chinasoft.ssm.controller;

import com.chinasoft.ssm.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.connector.Request;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.*;

@Controller
@RequestMapping("/")
public class UserController extends  BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping("index")
    public ModelAndView index(HttpServletRequest request){
        Map<String,Object> map = getParamData(request);
        return new ModelAndView("index",userService.selectUserListData(map,userService.selectUserCount(map)));
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
    }
    @PostMapping("updataUser")
    public String updataUser1(HttpServletRequest request){
        userService.updateUser(getParamData(request));
        return "redirect:/index";
    }

    @GetMapping("showUpload")
    public String showUpload(){
        return "upload";
    }

    @PostMapping("insertPerson")
    public String insertPerson(@RequestParam("attr") MultipartFile file,HttpServletRequest request) throws Exception{
        String uploadUrl=upload(file);
        Map<String,Object> map=getParamData(request);
        map.put("url",uploadUrl);
        System.out.println(map);
        return "redirect:/index";
    }

    @GetMapping("index1")
    public String index1(){
        return "index1";
    }

    @PostMapping("ajax")
    @ResponseBody
    public String ajax() throws Exception{
        Map<String,Object> map=new HashMap<String,Object>();
        map=userService.selectUserListData(map,-1);
        ObjectMapper mapper=new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(map);
        return jsonStr;
    }
}
