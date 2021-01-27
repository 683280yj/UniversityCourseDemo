package com.chinasoft.ssm.service;

import com.chinasoft.ssm.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IUserService {

//    public List<User> selectUserList();
    public int selectUserCount(Map<String , Object> map);

    public int deleteUserByIds(List<String> list);

    public int insertUser(Map<String,Object> map);

    Map selectUserById(int userId);

    int updateUser(Map<String, Object> paramData);
    //业务逻辑层
    public Map<String , Object> selectUserListData(Map<String,Object> map,int totalCount);
}
