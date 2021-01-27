<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'app.jsp' starting page</title>

  </head>
  
  <body>
  		<%
  			//添加当前用户到application
  			String username = request.getParameter("username");
  			if(username != null){
  				List<String> users = (List<String>)application.getAttribute("userList");
  	  			if(users == null){
  	  				users = new ArrayList<String>();
  	  			}
  	  			users.add(username);
  	  			application.setAttribute("userList", users);
  			}
  		%>
    	<form action="app.jsp" method="post">
    		<input type="text" name="username" />
    		<input type="submit" value="加入聊天" />
    	</form>
    	<%
    		//显示所有在线用户
    		List<String> userlist = (List<String>)application.getAttribute("userList");
			if(userlist != null){
				for(int i=0; i<userlist.size(); i++){
					out.print(userlist.get(i)+"<br />");
				}
			}
    	%>
  </body>
</html>
