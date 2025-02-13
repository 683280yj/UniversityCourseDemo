package com.chinasoft.ssm.service.impl;

import com.chinasoft.ssm.dao.IUserDao;
import com.chinasoft.ssm.domain.User;
import com.chinasoft.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userMapper;
    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

    @Override
    public int deleteUserByIds(List<String> list) {
        return userMapper.deleteUserByIds(list);
    }

    @Override
    public int insertUser(Map<String, Object> map) {
        return userMapper.insertUser(map);
    }

    @Override
    public Map selectUserById(int userId) {
        return userMapper.selectUserById(userId);
    }

    @Override
    public int updateUser(Map<String, Object> paramData) {
        return userMapper.updateUserById(paramData);
    }
}
