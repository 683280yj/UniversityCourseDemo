package com.chinasoft.shop.dao;

import java.util.List;
import java.util.Map;

public interface UserMapper {

   // public List<Map<String,Object>> selectUserList();

    //判断用户是否存在的方法
    public Map<String,Object> queryUserIsExist(Map<String,Object> map);

    //用户注册的方法
    public int insertUser(Map<String,Object> map);

    public Map<String,Object> userLogin(Map<String,Object> map);

    //修改用户的方法
    public int updateUser(Map<String,Object> map);

    //查询出该用户的对应的地址的数据
    public List<Map<String,Object>> queryAddressList(Map<String,Object> map);

    public int updateUserAddressOne(Map<String,Object> map);

    public int updateUserAddressTwo(Map<String,Object> map);
//查询出所有的区域相关的数据
    public List<Map<String,Object>> selectAreaList();

    //产品插入的方法
    public int insertProduct(Map<String,Object> map);

    public List<Map<String,Object>> queryProductList(Map<String,Object> map);


    public List<Map<String,Object>> queryUserShopCartList(Map<String,Object> map);

    public int insertUserShopCart(Map<String,Object> map);

    public Map<String,Object> queryProductListByProductId(Map<String,Object> map);


    public Map<String,Object> queryUserShopCartListByUserIdAndProductId(Map<String,Object> map);

    public int updateUserShopCart(Map<String,Object> map);



}
