package com.pxy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String loginID = null;
		if(request.getParameter("loginID") != null){
			//1. 验证账号密码
			
			//2. 保存账号
			loginID = request.getParameter("loginID");
			request.getSession().setAttribute("loginID", loginID);
		}
		
	}

}
