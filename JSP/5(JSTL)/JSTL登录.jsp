<%@page import="dao.UserDao"%>
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
    
    <title>jstl</title>

  </head>
  
  <body>
  <%
  	String loginID = request.getParameter("loginID");
  	String loginPWD = request.getParameter("loginPWD");
  	if(loginID!=null && loginPWD!=null){
  		if(UserDao.login(loginID, loginPWD)>0){
  			session.setAttribute("loginID", loginID);
  		}
  		else{
  			response.getWriter().write("<script>alert('账号或密码错误！')</script>");
  		}
  	}
  	else{
  		response.getWriter().write("<script>alert('请输入账号和密码！')</script>");
  	}
  %>
  	<c:if var="isLogin" test="${empty loginID }">
  		<form action="l6.jsp" method="post">
			账号：<input type="text" name="loginID" />
			密码：<input type="password" name="loginPWD" />
			<input type="submit" value="登录" />
		</form>
  	</c:if>
	<c:if test="${!isLogin }">
		<span>欢迎你：<a href="#">${loginID }</a></span>
	</c:if>
  </body>
</html>






		<form action="reg.jsp" method="post">
		<input  type="submit" value="注册"/>	
		</form>