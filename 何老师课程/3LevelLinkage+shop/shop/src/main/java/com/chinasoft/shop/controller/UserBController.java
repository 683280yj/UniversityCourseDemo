package com.chinasoft.shop.controller;

import com.alibaba.fastjson.JSONObject;
import com.chinasoft.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class UserBController {
    @Autowired
    private IUserService userService;

    //    @PostMapping("loadArea")
    @RequestMapping("/loadArea")
    public String loadArea(HttpServletRequest request, String parentId) {
        return userService.selectAreaList(parentId);
    }

    @RequestMapping("/loadPro")
    public String loadPro(HttpServletRequest request, String areaName) {
        return userService.selectAreaListA(areaName);
    }

}
