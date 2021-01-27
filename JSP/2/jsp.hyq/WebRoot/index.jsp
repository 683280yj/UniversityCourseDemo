<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>

  </head>
  
  <body>
    		<%
		request.setCharacterEncoding("utf-8");	//设置字符编码
	
		String loginID = request.getParameter("loginID");
		String loginPWD = request.getParameter("loginPWD");
		String loginPWDTwo = request.getParameter("loginPWDTwo");
		String phoneID = request.getParameter("phoneID");
	%>
	账号：<%=loginID %><br />
	密码：<%=loginPWD %><br />
	确认密码：<%=loginPWDTwo %><br />
	手机号码：<%=phoneID %><br />
	
  </body>
</html>
