<%@page import="com.pxy.dao.SingerDao"%>
<%@page import="com.pxy.dao.Singer"%>
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
    
    <title>歌手列表</title>

  </head>
  
  <body>
  	<%
  		List<Singer> singerList = SingerDao.selectAll();
  		session.setAttribute("singerList", singerList);
  	%>
  	
	<table border="1" cellspacing="0" cellpadding="0" style="width: 400px; margin: 0px auto;">
		<tr>
			<th>编号</th>
			<th>名称</th>
			<th>类型</th>
		</tr>
		<c:forEach items="${singerList }" var="singer" varStatus="status">
			<tr <c:if test="${status.index%2==0 }"> style="background-color: #ff00ff"</c:if> >
				<td>${singer.singerID }</td>
				<td align="center">${singer.singerName }</td>
				<td>${singer.singerType }</td>
			</tr>
		</c:forEach>
		
	</table>  	
  </body>
</html>
