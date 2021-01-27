<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>个人中心</title>
	
  </head>
  
  <body>

      	<%
  		Object loginID = session.getAttribute("loginID");
  		if(loginID != null){
  			out.print("欢迎你："+loginID + "<a href='exit.jsp'>注销</a>");
  		}
  		else{
  			session.setAttribute("err", "请先登录！");
  			response.sendRedirect("login.jsp");
  		}
  	%>
  </body>
</html>
