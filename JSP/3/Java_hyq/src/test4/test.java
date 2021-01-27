package test4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class test {
	static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String url = "jdbc:sqlserver://localhost;databasename=empDB";
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "sa", "123456");
			Statement statement = conn.createStatement();
			
	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
