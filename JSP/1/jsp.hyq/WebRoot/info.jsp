<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>rank</title>
    


  </head>
  
  <body>
			<form action="page.jsp" method="post">
    	<label>请输入排位分：</label>
    	<input type="text" name="age" />
    	<input type="submit" value="提交" />
    </form>
  </body>
</html>
