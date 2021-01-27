package com.pxy.dao;

import java.sql.ResultSet;

public class UserDao {
	public static int login(String loginID, String loginPWD){
		String sql = "select * from userTbl where loginID='"+loginID+"' and loginPWD='"+loginPWD+"'";
		return select(sql);
	}
	
	//账号是否可用 0.可用 1.已被注册
	public static int isReg(String loginID){
		String sql = "select * from userTbl where loginID='"+loginID+"'";
		return select(sql);
	}
	//添加用户
	public static void add(String loginID, String loginPWD){
		String sql = "insert into userTbl(loginID, loginPWD) values(?, ?)";
		Object[] params = new Object[2];
		params[0] = loginID;
		params[1] = loginPWD;
		DBManage.modifyEntiy(sql, params);
	}
	
	//通用查询，是否能查询到数据
	private static int select(String sql){
		int state = 0;
		ResultSet rs =  DBManage.getResultSet(sql);
		
		try {
			if(rs.next()){
				state = 1;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return state;
	}
}
