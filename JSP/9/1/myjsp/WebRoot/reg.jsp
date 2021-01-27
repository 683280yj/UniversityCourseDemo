<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>


  </head>
  
  <body>
    <form action="reg" method="post">
    	<label>账号：</label>
    	<input type="text" name="loginID" /><br />
    	<label>密码：</label>
    	<input type="password" name="loginPWD" /><br />
    	<label>重复密码：</label>
    	<input type="password" name="pwdTwo" /><br />
    	<input type="submit" value="注册" />
    </form>
    <div style="color:red;">${err }</div>
  </body>
</html>
