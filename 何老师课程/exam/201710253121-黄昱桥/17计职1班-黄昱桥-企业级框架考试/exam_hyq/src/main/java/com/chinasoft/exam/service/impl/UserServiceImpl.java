package com.chinasoft.exam.service.impl;

import com.chinasoft.exam.dao.IUserDao;
import com.chinasoft.exam.domain.Profile;
import com.chinasoft.exam.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userMapper;

    @Override
    public List<Profile> getAll() {
        return userMapper.getAll();
    }

    @Override
    public Profile get(int profileId) {
        return userMapper.get(profileId);
    }

    @Override
    public void update(Profile profile) {
//        return userMapper.update(map);
    }

    @Override
    public Map selectUserById(int profileId) {
        return userMapper.selectUserById(profileId);
    }
}
