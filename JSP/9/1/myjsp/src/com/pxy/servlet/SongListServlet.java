package com.pxy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pxy.dao.Song;
import com.pxy.dao.SongDao;

public class SongListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//1.得到传递的参数（类型，歌曲名模糊搜索）
		String typeID = request.getParameter("typeID");
		String title = request.getParameter("title");
		//2.判断参数数据是否正常
		if(typeID != null  && title !=null){
			//3.到数据库查询
			List<Song> list = SongDao.selectByWhere(Integer.parseInt(typeID), title);
			//4.将数据保存到request并跳转页面
			request.setAttribute("songList", list);
			request.getRequestDispatcher("songlist.jsp").forward(request, response);
		}
		else{
			//查询所有数据
			List<Song> list = SongDao.selectAll();
			//跳转页面
			request.setAttribute("songList", list);
			request.getRequestDispatcher("songlist.jsp").forward(request, response);
		}
	}

}
