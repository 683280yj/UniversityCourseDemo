package com.chinasoft.work.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "姓名：黄昱桥"+"<br>"+
                "性别：男"+"<br>"+
                "爱好：吉他，篮球，编程"+"<br>"+
                "身高：178cm"+"<br>"+
                "体重：120";
    }
}
