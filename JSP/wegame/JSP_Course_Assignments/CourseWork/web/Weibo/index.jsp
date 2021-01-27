<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2019/11/20
  Time: 01:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Weibo</title>
</head>
<body>
<h3>Homework Weibo</h3>
<div>
    <a href="Weibo/rl/login.jsp">Login</a>
</div>
<div>
    <a href="Weibo/rl/loginAdmin.jsp">Admin Login</a>
</div>
</body>
</html>
