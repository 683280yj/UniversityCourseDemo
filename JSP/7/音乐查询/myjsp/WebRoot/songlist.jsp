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
    
    <title>static歌曲列表</title>

  </head>
  
  <body>
			<div style="width: 800px; margin: 0px auto;text-align: center;">
			<form action="songlist" method="post">
				<select name="typeID">
					<option value="-1" selected="selected">全部</option>
					<option value="1">热门流行</option>
					<option value="2">经典老歌</option>
					<option value="3">影视金曲</option>
					<option value="7">摇滚</option>
				</select>
				<input type="text" name="title" />
				<input type="submit" value="搜索" />
			</form>
		</div>
		<table border="1" cellspacing="0" cellpadding="0" style="width: 800px; margin: 0px auto;">
			<tr>
				<th>编号</th>
				<th>名称</th>
				<th>点击数</th>
			</tr>
			<c:forEach items="${songList }" var="song">
			<tr>
				<td>${song.songID }</td>
				<td>${song.title }</td>
				<td>${song.hit }</td>
			</tr>
			</c:forEach>
		</table>
  </body>
</html>
