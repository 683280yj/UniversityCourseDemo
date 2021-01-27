package com.pxy.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class MyBindingListener implements HttpSessionBindingListener {

	private String loginID;
	public MyBindingListener(String loginID){
		this.loginID = loginID;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(loginID+"对象保存到了Session");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(loginID+"对象被赶出了Session！");
	}

}
