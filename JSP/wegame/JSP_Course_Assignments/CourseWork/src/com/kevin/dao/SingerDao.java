package com.kevin.dao;

import com.kevin.baseclass.Singer;
import com.kevin.dbm.DBManage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2019/11/14 9:34
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.baseclass
 * @classname SingerDao
 * @description TODO 提供歌手信息
 * @interface/enum
 */
public class SingerDao {
    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/11/20 00:58
     * @description SingerDao / selectAll TODO 提供所有歌手的查询
     * @returns java.util.List<com.kevin.baseclass.Singer>
     */
    public static List<Singer> selectAll() {
        List<Singer> list = new ArrayList<Singer>();
        try {
            String sql = "SELECT SingerID,SingerName,SingerType FROM singer";
            ResultSet resultSet = DBManage.getResultSet(sql);
            while (resultSet.next()) {
                Singer singer = new Singer(resultSet.getInt("SingerID"), resultSet.getString("SingerName"), resultSet.getString("SingerType"));
                list.add(singer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
