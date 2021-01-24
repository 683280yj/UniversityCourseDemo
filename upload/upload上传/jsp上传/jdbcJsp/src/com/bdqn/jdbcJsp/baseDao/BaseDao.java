package com.bdqn.jdbcJsp.baseDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String username="scott";
	private static final String password="tiger";
	private static Connection con;
	
	static{
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getCon(){
		return con;
	}
	
	public static void main(String[] args) {
		Connection con1=BaseDao.getCon();
		System.out.println(con1);
	}
	
	

}
