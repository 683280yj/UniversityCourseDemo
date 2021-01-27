package com.chinasoft.exam.domain;

import lombok.Data;

@Data
public class Profile {
    private int profileId;//id
    private String profileName;//姓名
    private String profileBirthday;//年龄
    private String profileGender;//性别
    private String profileCareer;//职业
    private String profileAddress;//住所
    private String profileMobile;//手机号
    public Profile(){}
}
