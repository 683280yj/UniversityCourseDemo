package com.chinasoft.web.daomain;

import lombok.Data;

@Data
public class address {
    private int addId;
    private String addReceiver;
    private String addPhone;
    private String addProvince;
    private String addCity;
    private String addCounty;
    private String addAddress;
    private int userId;
    public address(){}
}
