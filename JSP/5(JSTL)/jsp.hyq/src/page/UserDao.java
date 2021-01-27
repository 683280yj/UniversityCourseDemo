package page;

import java.sql.ResultSet;

import org.apache.taglibs.standard.lang.jstl.test.StaticFunctionTests;
import org.omg.CORBA.PUBLIC_MEMBER;

public class UserDao {
	public static int login(String loginID, String loginPWD){
		int state = 0;
		String sql = "select * from Table_1 where loginID='"+loginID+"' and loginPWD='"+loginPWD+"'";
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

	public static int register(String loginID, String loginPWD) {
		String sql = "INSERT INTO accusertbl( loginID, loginPWD) VALUES(" +loginID+","+loginPWD+")";
		ResultSet re = DBManage.getResultSet(sql);
		return 1;
		}
	}

		
