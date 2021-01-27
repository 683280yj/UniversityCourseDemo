package com.chinasoft.web.controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BaseController {
    public Map<String,Object> getParamData(HttpServletRequest request){
        Map<String,String[]> map=request.getParameterMap();
        Map<String,Object> mapAll=new HashMap<String,Object>();//最后组装成的map
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            String key=it.next();//String 类型的key
            String[] value= map.get(key);
            System.out.println(value[0]);
            Object value1=value[0];
            mapAll.put(key,value1);
        }
        return mapAll;
    }
}
