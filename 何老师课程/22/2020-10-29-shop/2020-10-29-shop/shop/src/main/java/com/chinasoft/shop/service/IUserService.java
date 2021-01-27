package com.chinasoft.shop.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface IUserService {
   // public List<Map<String,Object>> selectUserList();

    public boolean selectUserIsExist(Map<String,Object> map);

    public String insertUser(Map<String,Object> map, HttpServletRequest request);

    //登录的方法
    public String userLogin(Map<String,Object> map, HttpSession session,HttpServletRequest request);

    public List<Map<String,Object>> queryAddressList(Map<String,Object> map,HttpSession session);

    public int updateUserAddress(Map<String,Object> map);

    public String selectAreaList();

    public int insertProduct(Map<String,Object> map,String url);

    public List<Map<String,Object>> queryProductList(Map<String,Object> map);

    public List<Map<String,Object>> queryUserShopCartList(Map<String,Object> map);

    public String insertUserShopCart(Map<String,Object> map,HttpServletRequest request);

    //进入该用户的购物车环节
    public String selectUserShopCartList(HttpServletRequest request);



}
