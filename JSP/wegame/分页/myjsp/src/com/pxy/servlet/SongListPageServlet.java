package com.pxy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pxy.dao.SongDao;
import com.pxy.entity.Song;

public class SongListPageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num = 4;		//每页数量
		int index = 1;		//当前页码
		int maxNum = SongDao.selectCount();		//总记录数
		int max = maxNum/num + (maxNum%num==0?0:1);		//最大页码
		List<Song> list = new ArrayList<Song>();
		if(request.getParameter("index")!=null){
			index = Integer.parseInt(request.getParameter("index"));
		}
		list = SongDao.selectPage(index, num);
		request.setAttribute("index", index);
		request.setAttribute("max", max);
		request.setAttribute("songList", list);
		request.getRequestDispatcher("songpage.jsp").forward(request, response);
	}

}
