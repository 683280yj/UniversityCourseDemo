package com.chinasoft.web.dao;

import com.chinasoft.web.daomain.address;
import com.chinasoft.web.daomain.login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IUserDao {
    //Login
    public HashMap selectUserLogin(String userName, String userPwd);
    //登录和查询账号密码是否匹配
    public List<login> selectLogin(String userName, String userPwd);
    //注册
    public int insertReg(Map<String,Object> map);
    //UserInfo
    //查询地址信息
    public List<address> selectUserById(String userName, String userPwd);
    //删除地址信息
    public int deleteUserByIds(int addId);
//    public List<address> selectDelUser(int addId);

}
