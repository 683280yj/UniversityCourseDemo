package com.chinasoft.jpa.domain;

import lombok.Data;

import javax.persistence.*;

//@Entity(name="user") 相当于下面两个加起来
@Entity//表示这是一个实体
@Table(name = "user")//这个实体类映射的是对应的table的名称是user
//@Data//插件
public class User {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")//表的列的名称
    private int userId;

    @Column(name = "user_nick")
    private String userNick;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public User() {
    }
}
