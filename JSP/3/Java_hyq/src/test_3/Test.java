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
					//1.��������
					Class.forName(driver);
					//1.2�������ݿ�
					Connection conn = DriverManager.getConnection(url, "sa", "123");
					//2.����SQLִ�ж���
					Statement statement = conn.createStatement();
					//3.ִ��SQL���
//					//3.1 ��ӡ�ɾ�����޸���·
//					String sql = "insert into dvdtbl(dvdname,state) values('�����칬',0)";
//					statement.executeUpdate(sql);
					//3.2��ѯ
					String sql = "select dvdid,dvdname,state,outdate from dvdtbl";
					ResultSet rs = statement.executeQuery(sql);
					while (rs.next()) {
						System.out.println(rs.getInt("dvdid")+"\t"+
								rs.getString("dvdname")+"\t"+
								rs.getInt("state")+"\t"+
								rs.getString("outdate"));
					}
					//4.�ر�����
					conn.close();
					
					System.out.println("��ӳɹ���");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
		}
}
