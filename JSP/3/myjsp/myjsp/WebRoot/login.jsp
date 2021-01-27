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
    	<form action="valilogin.jsp" method="post">
			<p>
				<label>账号：</label>
				<input type="text" name="loginID" />
			</p>
			<p>
				<label>密码：</label>
				<input type="password" name="loginPWD" />
			</p>
			
			<p>
				<input type="submit" value="登录"/>	
			</p>
			<%
				if(request.getAttribute("err")!=null){
					out.print("<p style='color:red;'>"+request.getAttribute("err")+"</p>");
				}
			%>
		</form>
  </body>
</html>
