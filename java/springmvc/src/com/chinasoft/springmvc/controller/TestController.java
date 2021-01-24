package com.chinasoft.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.chinasoft.springmvc.pojo.User;
//ע��(���ڷ�չpom.xml maven)
@Controller
@RequestMapping("/")
//@RequestMapping("/index")ǰ׺
public class TestController {
	//@RequestMapping("/home")//����·��get
	@RequestMapping(value="/home",method=RequestMethod.GET)//����·��get
	public String home(@RequestParam("account") String account,@RequestParam("password") int password){
		System.out.println(account);
		System.out.println(password);
		System.out.println("�ҽ��뵽home��������!!");
		//return "home.jsp";//�������ǰ׺��Ҫ������һ����..///Ĭ�Ͼ���ת��
		return "home.jsp";
	}
	
	@RequestMapping(value="/index{pageNo}-{pageSize}",method=RequestMethod.GET)//����·��get
	public String index(@PathVariable int pageNo,@PathVariable int pageSize){
		System.out.println(pageNo);
		System.out.println(pageSize);
		System.out.println("�ҽ��뵽home��������!!");
		//return "home.jsp";//�������ǰ׺��Ҫ������һ����..///Ĭ�Ͼ���ת��
		return "home.jsp";
	}
	
	@RequestMapping(value="/pojo",method=RequestMethod.GET)//����·��get
	public String pojo(@ModelAttribute("user") User us){
		System.out.println(us.getAccount());
		System.out.println(us.getPassword());
		return "home.jsp";
	}
	
	//<a href="method/items3.form
	//<a href="method/items.form?num=3
	
//	@RequestMapping(value="/home",method=RequestMethod.POST)
//	public String home1(){
//		System.out.println("�ҽ��뵽home1��������!!");
//		//return "home.jsp";//�������ǰ׺��Ҫ������һ����..///Ĭ�Ͼ���ת��
//		return "home.jsp";
//	}

}
