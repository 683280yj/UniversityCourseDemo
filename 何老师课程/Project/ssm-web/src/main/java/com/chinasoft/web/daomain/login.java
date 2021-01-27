package com.chinasoft.web.daomain;

import lombok.Data;

@Data
public class login {
    private int userId;
    private String userName;
    private String userPwd;
    private String userNick;
    public login(){}
}
