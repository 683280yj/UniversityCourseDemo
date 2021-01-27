package com.pxy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pxy.dao.UserDao;

public class RegServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String loginID = request.getParameter("loginID");
		String loginPWD = request.getParameter("loginPWD");
		String pwdTwo = request.getParameter("pwdTwo");
		//1.输入的数据是否完整
		if(loginID != null && loginPWD != null && pwdTwo != null){
			if(loginID.trim().length()>0 && loginPWD.trim().length()>0 && pwdTwo.trim().length()>0){
				//2.输入的账号是否已注册
				int state = 0;	//当前账号状态   0.可用 1.已被注册
				//2.1 通过数据查询，当前注册账号是否可用（未完成）
				state = UserDao.isReg(loginID);
				//2.2 判断账号是否可用
				if(state==0){
					//3.没有注册的账号才能注册成功，调用Dao的注册方法
					UserDao.add(loginID, loginPWD);
					//4.页面跳转（两种情况：1.注册完就完成登录，跳转到首页  2.注册完跳转到登录页面）,当前使用第二种情况
					response.sendRedirect("login.jsp");
				}
				else{
					request.setAttribute("err", "该账号已注册！");
					//返回注册页面，并提示错误信息
					request.getRequestDispatcher("reg.jsp").forward(request, response);
				}

			}
			else{
				request.setAttribute("err", "账号和密码必须填写！");
				//返回注册页面，并提示错误信息
				request.getRequestDispatcher("reg.jsp").forward(request, response);
			}
		}
		else{
			response.sendRedirect("reg.jsp");
		}
	}

}
