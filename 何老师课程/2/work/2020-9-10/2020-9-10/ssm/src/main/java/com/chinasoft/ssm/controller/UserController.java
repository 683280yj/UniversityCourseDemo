package com.chinasoft.ssm.controller;

import com.chinasoft.ssm.config.jdbcConfigProperties;
import com.chinasoft.ssm.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/index")
    public String index(){
        //System.out.println(dataSource);
      //new jdbcConfigProperties().set
        return "hello";
    }
}
