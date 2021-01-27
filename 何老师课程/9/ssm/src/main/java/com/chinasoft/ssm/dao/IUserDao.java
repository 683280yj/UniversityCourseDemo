package com.chinasoft.ssm.dao;

import java.util.*;

//@Repository//表明这是一个接口
public interface IUserDao {
    public List<Map<String,Object>> selectUserList(Map<String, Object> map);//数据访问层

    //查询出数据的总条数
    public int selectUserCount(Map<String , Object> map);

    public int deleteUserByIds(List<String> list);

    public int insertUser(Map<String,Object> map);

    public Map selectUserById(int userId);

    public int updateUserById(Map<String, Object> map);


}
