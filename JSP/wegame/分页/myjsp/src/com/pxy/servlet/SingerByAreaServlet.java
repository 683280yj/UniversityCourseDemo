package com.pxy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pxy.dao.SingerDao;
import com.pxy.entity.Singer;

public class SingerByAreaServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/xml;charset=UTF-8");
		if(request.getParameter("area")!=null){
			String area = request.getParameter("area");
			List<Singer> list = SingerDao.selectByArea(area);
			String strSinger = "";
			for (Singer singer : list) {
				strSinger += singer.getSingerName()+"<br />";
			}
			response.getWriter().write(strSinger);
		}
		else{
			response.getWriter().write("请选择区域");
		}
	}

}
