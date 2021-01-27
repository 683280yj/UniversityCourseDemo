package com.pxy.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SongDao {
	
	//查询所有数据
	public static List<Song> selectAll(){
		String sql = "select * from song";
		return select(sql);
	}
	//有条件查询
	public static List<Song> selectByWhere(int typeID, String title){
		String sql = "select * from song where 1=1 ";
		if(typeID>0){
			sql += " and typeID="+typeID;
		}
		if(title.length()>0){
			sql += " and title like '%"+title+"%'";
		}
		return select(sql);
	}
	
	//根据SQL返回数据集
	private static List<Song> select(String sql){
		List<Song> list = new ArrayList<Song>();
		try {
			ResultSet rs = DBManage.getResultSet(sql);
			while (rs.next()) {
				Song song = new Song(rs.getInt("songID"), rs.getString("title"), 
						rs.getString("pingTitle"), rs.getInt("typeID"), 
						rs.getInt("singerID"), rs.getInt("hit"), rs.getString("url"));
				list.add(song);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return list;
	}
}
