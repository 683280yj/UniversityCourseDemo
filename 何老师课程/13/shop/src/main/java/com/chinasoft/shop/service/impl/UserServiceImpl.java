package com.chinasoft.shop.service.impl;

import com.chinasoft.shop.dao.UserMapper;
import com.chinasoft.shop.service.IUserService;
import com.chinasoft.shop.tool.IPUtil;
import com.chinasoft.shop.tool.MD5Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean selectUserIsExist(Map<String, Object> map) {
        if(userMapper.queryUserIsExist(map)==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String insertUser(Map<String, Object> map, HttpServletRequest request) {
        //将密码加密后放入
        map.put("userPassword", MD5Tool.string2MD5(map.get("userPassword").toString()));
        map.put("userRegTime",new Timestamp(System.currentTimeMillis()));
        map.put("userLastTime",new Timestamp(System.currentTimeMillis()));
        map.put("userLastLoginIp", IPUtil.getIP(request));
        map.put("userStatus",1);
        map.put("userSessionId",request.getSession().getId());
        int count= userMapper.insertUser(map);
        if (count==1){
            return "redirect:/login";
        }else {
            request.getSession().setAttribute("msg","注册失败");
            return "redirect:/webPage/register.html";
        }
//        return userMapper.insertUser(map);
    }

    @Override
    public String userLogin(Map<String, Object> map, HttpSession session) {
//        Map<String,Object> dataMap=userMapper.userLogin(map);
        System.out.println("1="+map);
        System.out.println("2="+userMapper.userLogin(map));
        if (userMapper.userLogin(map)==null){
            //账号错误
            session.setAttribute("msg","账号不存在");
            return "redirect:/login";
        }else{
            Map<String,Object> dataMap = userMapper.userLogin(map);
            if(!dataMap.get("userPassword").toString().equals(MD5Tool.string2MD5(map.get("userPassword").toString()))){
                session.setAttribute("msg","密码错误");
                return "redirect:/login";
            }else {
                session.setAttribute("user",dataMap);
                return "redirect:/peoplecenter";
            }
        }
    }
}
