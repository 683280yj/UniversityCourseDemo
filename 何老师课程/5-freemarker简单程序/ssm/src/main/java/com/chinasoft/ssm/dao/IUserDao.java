package com.chinasoft.ssm.dao;

import com.chinasoft.ssm.domain.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository//表明这是一个接口
public interface IUserDao {
    public List<User> selectUserList();
}
