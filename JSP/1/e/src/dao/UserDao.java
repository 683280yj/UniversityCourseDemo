package dao;

import java.sql.ResultSet;
import java.util.List;

import com.pxy.entity.Song;

public class UserDao {
	//验证账号是否可用 true可用,false不可用
	public static boolean valiLoginID(String loginID){
		boolean state = true;
		try {
			String sql = "select uid from usertbl where loginID='"+loginID+"'";
			ResultSet rs = DBManage.getResultSet(sql);
			if(rs.next()){
				state = false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return state;
	}
}
