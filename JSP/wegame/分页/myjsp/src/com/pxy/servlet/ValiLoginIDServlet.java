package com.pxy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pxy.dao.UserDao;

public class ValiLoginIDServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/xml;charset=UTF-8");
		if(request.getParameter("loginID")!=null){
			String loginID = request.getParameter("loginID");
			boolean state = UserDao.valiLoginID(loginID);
			if(state){
				response.getWriter().write("账号可用");
			}
			else{
				response.getWriter().write("账号已被注册");
			}
		}
		else{
			response.getWriter().write("请输入账号");
		}
	}

}
