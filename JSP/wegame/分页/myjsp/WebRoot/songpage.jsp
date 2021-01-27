<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>歌曲列表</title>
	
  </head>
  
  <body>
  	<ul>
    <c:forEach items="${songList }" var="song">
		<li>${song.title }</li>
	</c:forEach>
	</ul>
	<a href="slps?index=1">首页</a>&nbsp;
	<a href="slps?index=${index-1==0?1:index-1 }">上一页</a>&nbsp;
	<a href="slps?index=${index+1>max?max:index+1 }">下一页</a>&nbsp;
	<a href="slps?index=${max }">末页</a>&nbsp;
  </body>
</html>
