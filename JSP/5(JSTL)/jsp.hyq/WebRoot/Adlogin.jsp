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
    
    <title>类型登录</title>

  </head> 
  
  <body>
    <%
    	String userType = request.getParameter("userType");
    	
    %>
	<form action="Adlogin.jsp" method="post">
		类型：<select name="userType">
			<option value="1">学生</option>
			<option value="2">老师</option>
			<option value="3">管理员</option>
		</select><br />
		账号：<input type="text" name="loginID" /><br />
		密码：<input type="password" name="loginPWD" /><br />
		<input type="submit" value="登录" />
	</form>
    <c:choose>
    	<c:when test='${param.userType=="1" }'>学生登录</c:when>
    	<c:when test='${param.userType=="2" }'>老师登录</c:when>
    	<c:when test='${param.userType=="3" }'>管理员登录</c:when>
    	<c:otherwise>请正常登录！</c:otherwise>
    </c:choose>
    
  </body>
</html>
