package com.kevin.dao;

import com.kevin.baseclass.User;
import com.kevin.dbm.DBManage;

import java.sql.ResultSet;

/**
 * @author Kevin KDA on 2019/11/8 11:46
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.dao
 * @classname UserDao
 * @description TODO 提供用户操作类
 * @interface/enum
 */
public class UserDao {
    /**
     * @param [loginID, loginPass]
     * @throws
     * @author Kevin KDA on 2019/11/20 00:44
     * @description UserDao / login TODO 提供用户登陆方法
     * @returns int
     */
    public static int login(String loginID, String loginPass) {
        int state = 0;
        String sql = "select * from accusertbl where loginID='" + loginID + "' and loginPass='" + loginPass + "'";
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

    /**
     * @param [loginID, loginPass, phoneNum]
     * @throws
     * @author Kevin KDA on 2019/11/20 00:43
     * @description UserDao / register TODO 提供单个用户注册方法
     * @returns int
     */
    public static int register(String loginID, String loginPass, String phoneNum) {
        String sql = "INSERT INTO accusertbl(loginID,loginPass,phoneNum) VALUES(" + loginID + "," + loginPass + "," + phoneNum + ")";
        ResultSet rs = DBManage.getResultSet(sql);
        return 1;
    }

    /**
     * @param [users]
     * @throws
     * @author Kevin KDA on 2019/11/20 00:43
     * @description UserDao / register TODO 提供批量用户注册方法
     * @returns int
     */
    public static int register(User[] users) {

        String sql;
        for (User u : users
        ) {
            sql = "INSERT INTO accusertbl(loginID,loginPass,phoneNum) VALUES(" + u.getLoginID() + "," + u.getLoginPass() + "," + u.getPhoneNum() + ")";
            ResultSet rs = DBManage.getResultSet(sql);
        }
        return 1;
    }
}
