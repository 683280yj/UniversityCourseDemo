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
	<script type="text/javascript">
			var xmlhttp;

			function valiloginID() {
				var loginID = document.getElementById("loginID").value;
				var url = "valilogin?loginID=" + loginID;
				//创建XMLhttp对象
				if(window.XMLHttpRequest) {
					xmlhttp = new XMLHttpRequest();
				} else if(window.ActiveXObject) {
					xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
				}
				//绑定回传事件
				xmlhttp.onreadystatechange = readData;
				//访问
				xmlhttp.open("get", url, true);
				xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
				xmlhttp.send(null);

			}
			//回调事件（用于接收数据）
			function readData() {
				var span = document.getElementById("err");
				if(xmlhttp.readyState == 4) {
					if(xmlhttp.status == 200) {
						span.innerHTML = xmlhttp.responseText;
					} else {
						alert("请求处理返回的数据有错误");
					}
				}

			}
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
