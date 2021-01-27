package com.chinasoft.shop.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface IUserService {
   // public List<Map<String,Object>> selectUserList();

    public boolean selectUserIsExist(Map<String,Object> map);

    public String insertUser(Map<String,Object> map, HttpServletRequest request);

    //登录的方法
    public String userLogin(Map<String,Object> map, HttpSession session);

    public List<Map<String,Object>> queryAddressList(Map<String,Object> map,HttpSession session);

}
