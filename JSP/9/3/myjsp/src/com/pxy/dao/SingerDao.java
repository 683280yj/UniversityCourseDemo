package com.pxy.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pxy.entity.Singer;

public class SingerDao {
	public static List<Singer> selectAll(){
		String sql = "select singerID,singerName from singer";
		return select(sql);
	}
	
	private static List<Singer> select(String sql){
		List< Singer> list = new ArrayList<Singer>();
		try {
			ResultSet rs = DBManage.getResultSet(sql);
			while (rs.next()) {
				Singer singer = new Singer(rs.getInt("singerID"), rs.getString("singerName"));
				list.add(singer);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
}
