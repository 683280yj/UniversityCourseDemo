<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>

  </head>
  
  <body>
    <%
    	if(session.getAttribute("loginID")!=null){
    		out.print("欢迎你："+request.getParameter("loginID"));
    	}
    	else{
    		out.print("<a href='login.jsp'>登录</a>");
    	}
    %>
  </body>
</html>
