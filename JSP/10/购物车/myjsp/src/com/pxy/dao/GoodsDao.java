package com.pxy.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pxy.entity.Goods;

public class GoodsDao {
	//查询所有商品
	public static List<Goods> selectAll(){
		String sql = "select driversID,driversName,unitPrice from drivers";
		return select(sql);
	}
	//根据ID查询单个商品
	public static Goods selectById(int gid){
		String sql = "select driversID,driversName,unitPrice from drivers where driversID="+gid;
		List<Goods> list = select(sql);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	//根据SQL查询商品
	private static List<Goods> select(String sql){
		List<Goods> list = new ArrayList<Goods>();
		try {

			ResultSet rs = DBManage.getResultSet(sql);
			while (rs.next()) {
				Goods goods = new Goods(rs.getInt("driversID"), rs.getString("driversName"), rs.getDouble("unitPrice"));
				list.add(goods);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
}
