<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>随机数</title>

  </head>
  
  <body>
    
     <a href="#">学术</a>
	<jsp:include page="haha.jsp">
		<jsp:param value='<%=request.getParameter("loginID") %>' name="loginID"/>
	</jsp:include>
	<a href="#">设置</a>
      
  </body>
</html>
