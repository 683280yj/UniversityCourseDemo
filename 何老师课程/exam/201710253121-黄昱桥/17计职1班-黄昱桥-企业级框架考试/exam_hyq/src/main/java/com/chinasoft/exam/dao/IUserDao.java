package com.chinasoft.exam.dao;

import com.chinasoft.exam.domain.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IUserDao {
    public List<Profile> getAll();//获得所有人员档案

    public Profile get(int profileId);//获得指定人员档案明细

    public void update(Profile profile);//更新指定人员的档案明细

    Map selectUserById(int profileId);

}
