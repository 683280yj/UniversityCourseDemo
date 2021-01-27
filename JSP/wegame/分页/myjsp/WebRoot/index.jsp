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
    	<div style="width: 800px; margin: 0px auto;text-align: center;">
			<form action="songlist" method="post">
				<select name="singerID">
					<option value="-1">全部</option>
					<c:forEach items="${singerList }" var="singer">
						<option value="${singer.singerID }">${singer.singerName }</option>
					</c:forEach>
				</select>
				<input type="text" name="title" />
				<input type="submit" value="搜索" />
			</form>
		</div>
		<table border="1" cellspacing="0" cellpadding="0" style="width: 800px; margin: 0px auto;">
			<tr>
				<th>编号</th>
				<th>名称</th>
				<th>类型</th>
				<th>点击数</th>
			</tr>
			<c:forEach items="${songList }" var="song">
			<tr>
				<td>${song.songID }</td>
				<td>${song.title }</td>
				<td>${song.typeName }</td>
				<td>${song.hit }</td>
			</tr>
			</c:forEach>
		</table>
  </body>
</html>
