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
    
    <title>登录</title>
    <style type="text/css">
    	img,a{
    		cursor: pointer;
    	}
    </style>
	<script type="text/javascript">
		function changeCode(){
			var img = document.getElementById("imgCode");
			img.src = "code?"+Math.random();
		}
	</script>
  </head>
  
  <body>
  <form action="login" method="post">
   	<input type="text" name="loginID" /><br />
   	<input type="text" name="inCode" /> 
   	<img id="imgCode" src="code" onclick="changeCode()" style="width: 80p; height: 30px" />
   	<a onclick="changeCode()">换一张</a><br />
   	<input type="submit" value="登录" />
   </form>
   <c:if test="${!empty login  }" var="islogin">
   	${login.loginID }<a href="exit">退出</a>
   </c:if>
  </body>
</html>
