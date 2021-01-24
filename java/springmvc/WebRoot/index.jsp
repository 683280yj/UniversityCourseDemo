<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <!-- a标签默认是get请求 post请求 -->
 <a href="home.do?account=admin&password=123">点击我进入controller的home方法</a>
 <a href="index3-15.do">点击我进入测试pathVariable方法</a>
 <form action="pojo.do" method="get">
 <input type="hidden" name="account" value="admin123"/>
  <input type="hidden" name="password" value="WER456"/>
 <input type="submit"/>
 </form>
  </body>
</html>
