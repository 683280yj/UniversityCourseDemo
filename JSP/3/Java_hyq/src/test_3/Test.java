package test_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
			static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			static String url = "jdbc:sqlserver://localhost;databasename=dvdDB";
			
			public static void main(String[] args) {
				try {
					//1.加载驱动
					Class.forName(driver);
					//1.2连接数据库
					Connection conn = DriverManager.getConnection(url, "sa", "123");
					//2.创建SQL执行对象
					Statement statement = conn.createStatement();
					//3.执行SQL语句
//					//3.1 添加、删除、修改套路
//					String sql = "insert into dvdtbl(dvdname,state) values('大闹天宫',0)";
//					statement.executeUpdate(sql);
					//3.2查询
					String sql = "select dvdid,dvdname,state,outdate from dvdtbl";
					ResultSet rs = statement.executeQuery(sql);
					while (rs.next()) {
						System.out.println(rs.getInt("dvdid")+"\t"+
								rs.getString("dvdname")+"\t"+
								rs.getInt("state")+"\t"+
								rs.getString("outdate"));
					}
					//4.关闭连接
					conn.close();
					
					System.out.println("添加成功！");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
		}
}
