package com.chinasoft.ssm.service;

import com.chinasoft.ssm.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    public List<User> selectUserList();
}
