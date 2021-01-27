package com.chinasoft.shop.controller;


import com.chinasoft.shop.dao.UserMapper;
import com.chinasoft.shop.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        return userService.userLogin(mapall,session,request);
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

    //updateUserAddressOne

        @GetMapping("updateUserAddress")
        public String updateUserAddress(HttpServletRequest request){
           // System.out.println("addressId="+getParamData(request));//接受需要更新为默认地址的addressId
            Map<String,Object> map=getParamData(request);
            System.out.println(map);
        int count=userService.updateUserAddress(map);
        return "redirect:/acceptAddress";
    }

    @PostMapping("loadArea")
    @ResponseBody
    public String loadArea(HttpServletRequest request){
       // ObjectMapper mapper = new ObjectMapper();
       // String jsonStr = mapper.writeValueAsString(map);
        return userService.selectAreaList();
    }

    //个人登录后就直接进入到主页面了，等下将个人中心的跳转转过来
    @GetMapping("main")
    public ModelAndView main(HttpServletRequest request){
        List<Map<String,Object>> list=userService.queryProductList(getParamData(request));
        Map<String,Object> m=new HashMap<String,Object>();
        m.put("list",list);
        m.put("count",list.size());//传递集合的长度过来
        return new ModelAndView("main",m);
    }

    @GetMapping("insertProduct")
    public String insertProduct(){

        return "product";
    }

    @PostMapping("insertProduct")
    public String insertProduct1(@RequestParam("attr") MultipartFile file,HttpServletRequest request){
        String url=null;
        Map<String,Object> map=new HashMap<String,Object>();
        int count=-1;
        try{
            url=upload(file);
            map=getParamData(request);
             count=userService.insertProduct(map,url);
        }catch (Exception e){
        }
        //System.out.println("url"+url);//得到地址
       // System.out.println("map"+map);//得到对应的前端的参数
       // System.out.println("count"+count);
        return "redirect:/insertProduct";
    }

    //addProduct

    @PostMapping("addProduct")
    @ResponseBody
    public String addProduct(HttpServletRequest request){
        Map<String,Object> map=getParamData(request);//这个时候map能拿到一个值，是productId
        String jsonStr=userService.insertUserShopCart(map,request);
        return jsonStr;
    }


    @GetMapping("myShopCart")
    public String myShopCart(HttpServletRequest request){
        //这个位置得变，如果是没有登录，那么回到登录页面否则的话是跳转到我的购物车页面

        return userService.selectUserShopCartList(request);
    }













}
