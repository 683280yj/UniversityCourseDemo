<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>

  </head>
  
  <body>
	<%
		request.setCharacterEncoding("utf-8");	//设置字符编码
	
		String loginID = request.getParameter("loginID");
		String loginPWD = request.getParameter("loginPWD");
		String loginPWDTwo = request.getParameter("loginPWDTwo");
		String[] hobbys = request.getParameterValues("hobby");
	%>
	账号：<%=loginID %><br />
	密码：<%=loginPWD %><br />
	确认密码：<%=loginPWDTwo %><br />
	爱好：
	<%
		for(int i=0; i<hobbys.length; i++){
	%>
		<%=hobbys[i] %>
	<%
		}
	%><br />
	您的IP是：<%=request.getRemoteAddr() %>
	<br />
  </body>
</html>
