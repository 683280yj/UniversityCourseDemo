package com.chinasoft.ssm.service.impl;

import com.chinasoft.ssm.dao.IUserDao;
import com.chinasoft.ssm.domain.User;
import com.chinasoft.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userMapper;
    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

}
