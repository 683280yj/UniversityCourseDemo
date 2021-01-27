package com.kevin.baseclass;

/**
 * @author Kevin KDA on 2019/11/19 22:31
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.baseclass
 * @classname User
 * @description TODO 提供用户类
 * @interface/enum
 */
public class User {
    private int uid;
    private String loginID;
    private String loginPass;
    private int state;
    private String phoneNum;

    public User() {
    }

    public User(String loginID, String loginPass, String phoneNum) {
        this.loginID = loginID;
        this.loginPass = loginPass;
        this.phoneNum = phoneNum;
    }

    public User(int uid, String loginID, String loginPass, int state, String phoneNum) {
        this.uid = uid;
        this.loginID = loginID;
        this.loginPass = loginPass;
        this.state = state;
        this.phoneNum = phoneNum;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
