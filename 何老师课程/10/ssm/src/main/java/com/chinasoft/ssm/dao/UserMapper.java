package com.chinasoft.ssm.dao;

import com.chinasoft.ssm.domain.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public List<User> selectUserList();

    public int deleteUserByIds(List<String> list);

    public int insertUser(Map<String,Object> map);

}
