package com.chinasoft.service.mapper;

import com.chinasoft.service.domain.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component("UserMapper")
public interface UserMapper extends Mapper<User> {
}
