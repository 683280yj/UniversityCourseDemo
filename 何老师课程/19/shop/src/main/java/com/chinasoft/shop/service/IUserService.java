package com.chinasoft.shop.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface IUserService {

    public boolean selectUserIsExist(Map<String,Object> map);

    public String insertUser(Map<String,Object> map, HttpServletRequest request);

    public String userLogin(Map<String,Object> map, HttpSession session);

    public List<Map<String,Object>> queryAddressList(Map<String,Object> map,HttpSession session);

    public int updateUserAddress(Map<String,Object> map);

    public String selectAreaList();

    public int addressInsert(String userAddressPeople,String userPhone,String userEmail,String userAddress,int userAddressStatus);

    public int deleteUserAddress(Map<String,Object> map);

    public int insertProduct(Map<String,Object> map,String url);

    public List<Map<String,Object>> queryProductList(Map<String,Object> map);
}
