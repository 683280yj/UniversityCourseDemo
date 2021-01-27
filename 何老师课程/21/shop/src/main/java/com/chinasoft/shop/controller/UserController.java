package com.chinasoft.shop.controller;


import com.chinasoft.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
//        System.out.println("----------insertUser----------");
        return userService.insertUser(getParamData(request),request);
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("userLogin")
    public String userLogin(HttpServletRequest request,HttpSession session){
        Map<String,Object> map=getParamData(request);
        return userService.userLogin(map,session,request);
    }

    @GetMapping("peoplecenter")
    public String peoplecenter(HttpServletRequest request){
        return "peoplecenter";
    }

    @GetMapping("acceptaddress")
    public String address(HttpServletRequest request,HttpSession session){
        if(session.getAttribute("user")==null){
            session.setAttribute("msg","您为经过登陆无法进行编辑");
            return "redirect:/login";
        }else{
            request.setAttribute("list",userService.queryAddressList(getParamData(request),session));
            return "address";
        }
    }

    @GetMapping("updateUserAddress")
    public String updateUserAddressOne(HttpServletRequest request){
        int count=userService.updateUserAddress(getParamData(request));
        return "redirect:/acceptaddress";
    }

    @GetMapping("del")
    public String del(HttpServletRequest request) {
        int id = userService.deleteUserAddress(getParamData(request));
        return "redirect:/acceptaddress";
    }

    @PostMapping("loadArea")
    @ResponseBody
    public String loadArea(HttpServletRequest request){
        return userService.selectAreaList();
    }

    @GetMapping("main")
    public ModelAndView main(HttpServletRequest request){
        List<Map<String,Object>> list = userService.queryProductList(getParamData(request));
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("list",list);
        map.put("count",list.size());
        return new ModelAndView("main",map);
    }

    @GetMapping("insertProduct")
    public String insertProduct(){
        return "product";
    }

    @PostMapping("insertProduct")
    public String insertProduct1(@RequestParam("attr") MultipartFile file, HttpServletRequest request,HttpSession session){
        String url=null;
        Map<String,Object> map=new HashMap<String,Object>();
        int count=-1;
        try {
            url=upload(file);
            map=getParamData(request);
            count=userService.insertProduct(map,url);
            System.out.println(count);
        }catch (Exception e){
        }
        return "redirect:/insertProduct";
    }

    @PostMapping("addProduct")
    @ResponseBody
    public String addProduct(HttpServletRequest request){
        Map<String,Object> map=getParamData(request);
        String json=userService.insertUserShopCart(map,request);
        return json;
    }

    @GetMapping("myShopCart")
    public String myShopCart(){
        return "shopcart";
    }

    @PostMapping("selectShopCart")
    public String selectShopCart(HttpServletRequest request, HttpSession session){
        Map<String,Object> map=getParamData(request);
        String json=userService.selectShopCart();
        System.out.println(json);
        return json;
    }
}
