package com.chinasoft.exam.service;

import com.chinasoft.exam.domain.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IUserService {
    public List<Profile> getAll();//获得所有人员档案

    public Profile get(int id);//获得指定人员档案明细

    public void update(Profile profile);//更新指定人员的档案明细

    Map selectUserById(int userId);
}
