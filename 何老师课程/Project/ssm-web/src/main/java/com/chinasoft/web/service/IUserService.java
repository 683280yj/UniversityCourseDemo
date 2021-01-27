package com.chinasoft.web.service;

import com.chinasoft.web.daomain.address;
import com.chinasoft.web.daomain.login;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface IUserService {
    public HashMap selectUserLogin(String userName, String userPwd);

    public List<login> selectLogin(String userName, String userPwd);

    public int insertReg(Map<String,Object> map);

    public List<address> selectUserById(String userName, String userPwd);

    public int deleteUserByIds(int addId);

//    public List<address> selectDelUser(int addId);
}

