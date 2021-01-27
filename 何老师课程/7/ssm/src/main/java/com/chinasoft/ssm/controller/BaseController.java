package com.chinasoft.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

public class BaseController {
    public List<String> getDelData(String ids){
        List<String> list=new ArrayList<String>();
        StringBuffer buff=new StringBuffer(ids);
        buff.delete(ids.length()-1,ids.length());
        String temp[]=ids.split(",");
        for(int i=0;i<temp.length;i++){
            list.add(temp[i]);
        }
        return list;
    }

    public Map<String,Object> getParamData(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Map<String, Object> mapAll = new HashMap<String, Object>();
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String[] value = map.get(key);
            Object value1 = value[0];
            mapAll.put(key, value1);
        }
        return mapAll;
    }
}
