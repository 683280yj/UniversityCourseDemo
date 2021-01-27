<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/15
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
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
<a href="#">学术</a>
<a href="InClass/e20191115/login.jsp">登录</a>
<%--<jsp:include page="InClass/e20191115/login.jsp">--%>
<%--  <jsp:param value='<%=request.getParameter("loginID") %>' name="loginID"/>--%>
<%--</jsp:include>--%>
<a href="#">设置</a>
</body>
</html>
