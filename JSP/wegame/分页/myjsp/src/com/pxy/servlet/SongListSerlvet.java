package com.pxy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pxy.dao.SingerDao;
import com.pxy.dao.SongDao;
import com.pxy.entity.Singer;
import com.pxy.entity.Song;

public class SongListSerlvet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Song song = new Song();
		if(request.getParameter("singerID")!=null){
			song.setSingerID(Integer.parseInt(request.getParameter("singerID")));
		}
		if(request.getParameter("title")!=null){
			song.setTitle(request.getParameter("title").trim());
		}
		
		//1. 加载歌手列表，将歌手列表保存到Session
		List<Singer> singerList = SingerDao.selectAll();
		request.getSession().setAttribute("singerList", singerList);
		//2. 加载歌曲列表，歌曲列表保存request
		List<Song> songList = SongDao.selectBySong(song);
		request.setAttribute("songList", songList);
		//3. 跳转页面
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
