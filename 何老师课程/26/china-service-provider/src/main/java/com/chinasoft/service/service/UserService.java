package com.chinasoft.service.service;

import com.chinasoft.service.domain.User;
import com.chinasoft.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id){
        System.out.println(userMapper.selectByPrimaryKey(id));
        return this.userMapper.selectByPrimaryKey(id);
    }

}
