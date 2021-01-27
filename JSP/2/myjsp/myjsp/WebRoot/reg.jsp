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
    	<form action="index.jsp" method="post">
			<p>
				<label>账号：</label>
				<input type="text" name="loginID" />
			</p>
			<p>
				<label>密码：</label>
				<input type="password" name="loginPWD" />
			</p>
			<p>
				<label>确认密码：</label>
				<input type="password" name="loginPWDTwo" />
			</p>
			<p>
				<label>爱好：</label>
				<input type="checkbox" name="hobby" value="java" />java&nbsp;
				<input type="checkbox" name="hobby" value="sql" />sql&nbsp;
				<input type="checkbox" name="hobby" value="python" />python&nbsp;
				<input type="checkbox" name="hobby" value="jsp" />jsp&nbsp;
			</p>
			<p>
				<input type="submit" value="注册"/>	
			</p>
			
		</form>
  </body>
</html>
