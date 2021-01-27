package com.chinasoft.ssm.dao;

import com.chinasoft.ssm.domain.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUserList();
}
