package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SingerDao {
	public static List<Singer> selectAll(){
		List<Singer> list = new ArrayList<Singer>();
		
		try {
			String sql ="select singerid,singername,singertype from singer";
			ResultSet rs = DBManage.getResultSet(sql);
			while (rs.next()) {
				Singer singer = new Singer(rs.getInt("singerID"), rs.getString("singerName"), rs.getString("singerType"));
				list.add(singer);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return list;
	}
}
