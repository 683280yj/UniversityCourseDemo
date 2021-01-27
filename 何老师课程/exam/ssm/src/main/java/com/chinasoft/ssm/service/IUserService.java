package com.chinasoft.ssm.service;

import com.chinasoft.ssm.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IUserService {

    public List<User> selectUserList();

    public int deleteUserByIds(List<String> list);

    public int insertUser(Map<String,Object> map);

    Map selectUserById(int userId);

    int updateUser(Map<String, Object> paramData);
}
