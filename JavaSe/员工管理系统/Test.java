package com.pxy.lesson12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String url = "jdbc:sqlserver://localhost;databasename=dvdDB";
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			//1.加载驱动
			Class.forName(driver);
			//2.连接数据库
			Connection conn = DriverManager.getConnection(url, "sa", "123");
			//3.创建SQL执行对象
			Statement statement = conn.createStatement();
			//3.执行SQL语句
//			//3.1 添加、删除、修改套路
//			String sql = "insert into dvdtbl(dvdname,state) values('大闹天宫',0)";
//			statement.executeUpdate(sql);
			//3.2查询
//			String sql = "select dvdid,dvdname,state,outdate from dvdtbl";
//			ResultSet rs = statement.executeQuery(sql);
//			while (rs.next()) {
//				System.out.println(rs.getInt("dvdid")+"\t"+
//						rs.getString("dvdname")+"\t"+
//						rs.getInt("state")+"\t"+
//						rs.getString("outdate"));
//			}
			//3.3带参数的删除
			String sql = "insert into dvdtbl(dvdname,state) values(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			System.out.print("请输入DVD名：");
			ps.setString(1, input.next());
			ps.setInt(2, 0);
			ps.execute();
			
			//3.4带参数的查询(查询所有未借出的DVD，查询所有已借出的DVD)
//			String sql = "select dvdid,dvdname,state,outdate from dvdtbl where state=?";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			System.out.print("请选择（0.未借出 1.已借出）：");
//			ps.setInt(1, input.nextInt());
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				System.out.println(rs.getInt("dvdid")+"\t"+
//						rs.getString("dvdname")+"\t"+
//						rs.getInt("state")+"\t"+
//						rs.getString("outdate"));
//			}
			
			ps.close();
			//4.关闭连接
			conn.close();
			
			System.out.println("执行成功！");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
