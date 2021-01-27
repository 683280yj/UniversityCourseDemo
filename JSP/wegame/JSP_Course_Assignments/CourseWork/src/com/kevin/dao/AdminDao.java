package com.kevin.dao;

import com.kevin.dbm.DBManage;

import java.sql.ResultSet;

/**
 * @author Kevin KDA on 2019/11/15 10:12
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.dao
 * @classname AdminDao
 * @description TODO 提供管理员操作类
 * @interface/enum
 */
public class AdminDao {
    /**
     * @param [loginID, loginPass]
     * @throws
     * @author Kevin KDA on 2019/11/20 00:59
     * @description AdminDao / login TODO 提供管理员用户登陆方法
     * @returns int
     */
    public static int login(String loginID, String loginPass) {
        int state = 0;
        String sql = "select * from accAdminTbl where loginID='" + loginID + "' and loginPass='" + loginPass + "'";
        ResultSet rs = DBManage.getResultSet(sql);

        try {
            if (rs.next()) {
                state = 1;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        return state;
    }
}
