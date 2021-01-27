package com.chinasoft.web.service.impl;

import com.chinasoft.web.daomain.login;
import com.chinasoft.web.dao.IUserDao;
import com.chinasoft.web.daomain.address;
import com.chinasoft.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userMapper;

    @Override
    public HashMap selectUserLogin(String userName, String userPwd) {
        return userMapper.selectUserLogin(userName,userPwd);
    }

    @Override
    public List<login> selectLogin(String userName, String userPwd) {
        return userMapper.selectLogin(userName,userPwd);
    }

    @Override
    public int insertReg(Map<String, Object> map) {
        return userMapper.insertReg(map);
    }

    @Override
    public List<address> selectUserById(String userName, String userPwd) {
        return userMapper.selectUserById(userName, userPwd);
    }

    @Override
    public int deleteUserByIds(int addId) {
        return userMapper.deleteUserByIds(addId);
    }

//    @Override
//    public List<address> selectDelUser(int addId) {
//        return userMapper.selectDelUser(addId);
//    }


}
