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
    <script src="js/jquery-1.11.0.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
	$(function(){
		$("#loginID").blur(function(){
			$("#err").load(
				"valilogin",
				{"loginID": $("#loginID").val()}
			);
		});
	});
	</script>
  </head>
  
  <body>
		<form action="" method="post">
			<label>账号：</label>
			<input type="text" id="loginID" name="loginID" onblur="valiloginID()" />
			<span id="err"></span>
			<br />
			<input type="submit" value="注册" />
		</form>
  </body>
</html>
