//package com.chinasoft.shop.service.impl;
//
//import com.chinasoft.shop.dao.UserMapper;
//import com.chinasoft.shop.service.IUserService;
//import org.quartz.Job;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class QuartzJobImpl implements Job {
//    @Autowired
//    private UserMapper mapper;
//
//    @Override
//    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("userEmail","666@qq.com");
//        //System.out.println("是否存在"+mapper.queryUserIsExist(map));
//        System.out.println("mapper"+mapper);
//        System.out.println("是否存在"+mapper.queryUserIsExist(map));
//        System.out.println("我是任务!");
//    }
//
//
//}
