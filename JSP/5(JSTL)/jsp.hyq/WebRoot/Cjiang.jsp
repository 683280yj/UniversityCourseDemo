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
    
    <title>Cjiang</title>
    
  </head>
  
  <body>
    		<%
    	Random rand = new Random();
    	session.setAttribute("num", rand.nextInt(10));
    %>
    <form action="Cjiang.jsp" method="post">
    	<input type="submit" value="抽奖" />
    </form>
    <c:choose>
    	<c:when test="${num==1 }">恭喜抽到一等奖！</c:when>
    	<c:when test="${num>=2 && num<=3 }">恭喜抽到二等奖！</c:when>
    	<c:when test="${num<=6 }">恭喜抽到三等奖！</c:when>
    	<c:otherwise>谢谢参与！</c:otherwise>
    </c:choose>
    
  </body>
</html>
