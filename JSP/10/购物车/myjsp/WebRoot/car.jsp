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
    
    <title>购物车</title>
    
  </head>
  
  <body>
    <table style="width: 1024px; margin: 0px auto;" border="1px" cellpadding="0px" cellspacing="0px">
			<tr>
				<th>名称</th>
				<th>单价</th>
				<th>数量</th>
				<th>合计</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${car.keySet() }" var="goods" >
			<tr align="center">
				<td>${goods.gName}</td>
				<td>￥${goods.price}</td>
				<td>
					<input type="button" value="-" />
					<input type="text" style="width: 20px;" value="${car.get(goods) }" />
					<input type="button" value="+" />
				</td>
				<td>￥${goods.price*car.get(goods)}</td>
				<td>
					<a href="#">删除</a>
				</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="5" align="right">
					总计：<span>￥${countPrice}</span>
				</td>
			</tr>
		</table>
  </body>
</html>
