package com.pxy.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyAppListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("程序关闭！！！");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("程序启动...");
	}

}
