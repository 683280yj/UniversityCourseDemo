package com.chinasoft.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.chinasoft.springmvc.pojo.User;
//注解(后期发展pom.xml maven)
@Controller
@RequestMapping("/")
//@RequestMapping("/index")前缀
public class TestController {
	//@RequestMapping("/home")//请求路径get
	@RequestMapping(value="/home",method=RequestMethod.GET)//请求路径get
	public String home(@RequestParam("account") String account,@RequestParam("password") int password){
		System.out.println(account);
		System.out.println(password);
		System.out.println("我进入到home里面来了!!");
		//return "home.jsp";//如果配置前缀需要返回上一级别..///默认就是转发
		return "home.jsp";
	}
	
	@RequestMapping(value="/index{pageNo}-{pageSize}",method=RequestMethod.GET)//请求路径get
	public String index(@PathVariable int pageNo,@PathVariable int pageSize){
		System.out.println(pageNo);
		System.out.println(pageSize);
		System.out.println("我进入到home里面来了!!");
		//return "home.jsp";//如果配置前缀需要返回上一级别..///默认就是转发
		return "home.jsp";
	}
	
	@RequestMapping(value="/pojo",method=RequestMethod.GET)//请求路径get
	public String pojo(@ModelAttribute("user") User us){
		System.out.println(us.getAccount());
		System.out.println(us.getPassword());
		return "home.jsp";
	}
	
	//<a href="method/items3.form
	//<a href="method/items.form?num=3
	
//	@RequestMapping(value="/home",method=RequestMethod.POST)
//	public String home1(){
//		System.out.println("我进入到home1里面来了!!");
//		//return "home.jsp";//如果配置前缀需要返回上一级别..///默认就是转发
//		return "home.jsp";
//	}

}
