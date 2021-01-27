package com.pxy.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pxy.entity.Singer;
import com.pxy.entity.Song;

public class SongDao {
	public static List<Song> selectBySong(Song song){
		String sql = "select s.songid,s.title,s.typeid,t.typename,s.singerid,s.hit from song s left join type t on s.TypeID=t.TypeID where 1=1 ";
		
		if(song.getSingerID()>0){
			sql += " and singerid="+song.getSingerID();
		}
		if(song.getTitle()!=null && song.getTitle().length()>0){
			sql += " and Title like '%"+song.getTitle()+"%'";
		}
		
		return select(sql);
	}
	
	private static List<Song> select(String sql){
		List< Song> list = new ArrayList<Song>();
		try {
			ResultSet rs = DBManage.getResultSet(sql);
			while (rs.next()) {
				Song song = new Song(
						rs.getInt("songID"), 
						rs.getString("title"), 
						rs.getInt("singerID"), 
						rs.getInt("typeID"), 
						rs.getString("typeName"), 
						rs.getInt("hit"));
				list.add(song);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
}
