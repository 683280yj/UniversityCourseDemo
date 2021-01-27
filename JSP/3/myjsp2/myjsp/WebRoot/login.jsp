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
  			Cookie[] cookies = request.getCookies();
  			String loginID = "";
  			String loginPWD = "";
  			if(cookies != null){
  				for(int i=0; i<cookies.length; i++){
  	  				if(cookies[i].getName().equals("loginID")){
  	  					loginID = cookies[i].getValue(); 
  	  				}
  	  				if(cookies[i].getName().equals("loginPWD")){
  	  					loginPWD = cookies[i].getValue(); 
  	  				}
  	  			}
  			}  			
  		%>
    	<form action="valilogin.jsp" method="post">
			<p>
				<label>账号：</label>
				<input type="text" name="loginID" value="<%=loginID %>" />
			</p>
			<p>
				<label>密码：</label>
				<input type="password" name="loginPWD" value="<%=loginPWD %>" />
			</p>
			<p>
				<input type="checkbox" name="islogin" value="1" checked="checked" /> 自动保存
			</p>
			<p>
				<input type="submit" value="登录"/>	
			</p>
			<p style="color:red;">
				<%=session.getAttribute("err")!=null ? session.getAttribute("err") : "" %>
			</p>
			<%
				if(request.getAttribute("err")!=null){
					out.print("<p style='color:red;'>"+request.getAttribute("err")+"</p>");
				}
			%>
		</form>
  </body>
</html>
