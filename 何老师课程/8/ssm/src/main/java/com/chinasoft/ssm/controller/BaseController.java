package com.chinasoft.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

public class BaseController {
    public List<String> getDelData(String ids){
        List<String> list=new ArrayList<String>();
        StringBuffer buff=new StringBuffer(ids);
        buff.delete(ids.length()-1,ids.length());
        //System.out.println(buff.toString());
        String temp[]=ids.split(",");
        for (int i=0;i<temp.length;i++){
            list.add(temp[i]);
        }
        return list;
    }

    public Map<String,Object> getParamData(HttpServletRequest request){
        Map<String,String[]> map=request.getParameterMap();
        Map<String,Object> mapAll=new HashMap<String,Object>();//最后组装成的map
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            String key=it.next();//String 类型的key
            String[] value= map.get(key);
            // System.out.println(value[0]);
            Object value1=value[0];
            mapAll.put(key,value1);
        }
        return mapAll;
    }
    //组装分页
    public Map<String,Object> getPageData(Map<String,Object> map,int totalCount){
        int pageIndex=0;
        int pageSize=0;
        int totalPage=0;
        int start=0;
        if (map.get("pageIndex")!=null&&!map.get("pageSize").toString().equals("")&&map.get("pageSize")!=null&&!map.get("pageSize").toString().equals("")){
            //分页,得到分页的总数
            pageIndex=Integer.parseInt(map.get("pageIndex").toString());
            pageSize=Integer.parseInt(map.get("pageSize").toString());
            totalPage=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
            start=(pageIndex-1)*pageSize;//得到索引号
            map.put("pageIndex",pageIndex);
            map.put("pageSize",pageSize);
            map.put("totlaPage",totalPage);
            map.put("start",start);
            map.put("totlaCount",totalCount);
        }
        return map;
    }
}
