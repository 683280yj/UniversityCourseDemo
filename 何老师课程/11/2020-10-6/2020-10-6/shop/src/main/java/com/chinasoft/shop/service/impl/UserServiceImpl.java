package com.chinasoft.shop.service.impl;

import com.chinasoft.shop.dao.UserMapper;
import com.chinasoft.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Map<String, Object>> selectUserList() {
        return userMapper.selectUserList();
    }
}
