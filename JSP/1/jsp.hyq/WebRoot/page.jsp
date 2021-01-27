<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Home Page</title>
    


  </head>
  
  <body>
    <%
    String msg = "";
    int age = request.getParameter("age")== null?0:Integer.parseInt(request.getParameter("age"));
    if(age>=2000){
    		msg = "大神带带我！！！";
    }
    else if(age>1700){
    		msg = "厉害！";
    }
     else if(age>=1600){
   			msg = "可以啊";
    }
     else if(age>=1400){
    		
    		msg = "正常水平";
    }
    else{
    		msg = "菜鸡，这不是你该来的地方";
    }
     %>
    <%=msg %>
    
  </body>
</html>
