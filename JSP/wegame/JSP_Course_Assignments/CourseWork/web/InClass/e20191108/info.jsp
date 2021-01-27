<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户年龄调查</title>


  </head>
  
  <body>
    <form action="../index.jsp" method="post">
    	<label>请输入年龄：</label>
    	<input type="text" name="age" />
    	<input type="submit" value="提交" />
    </form>
  </body>
</html>
