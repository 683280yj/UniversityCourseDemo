package com.chinasoft.service.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name="user_nick")
    private String userNick;
}
