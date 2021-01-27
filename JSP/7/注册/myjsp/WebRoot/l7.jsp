<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Servlet学习</title>

  </head>
  
  <body>
    <form action="test" method="post">
    	<input type="submit" value="访问" />
    </form>
    <a href="test">开始访问</a>
  </body>
</html>
