package com.pxy.dao;

import java.sql.ResultSet;

public class UserDao {
	public static int login(String loginID, String loginPWD){
		int state = 0;
		String sql = "select * from userTbl where loginID='"+loginID+"' and loginPWD='"+loginPWD+"'";
		ResultSet rs =  DBManage.getResultSet(sql);
		
		try {
			if(rs.next()){
				state = 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return state;
	}
}
