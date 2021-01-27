<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/15
  Time: 10:42
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
    <title>Register</title>
</head>
<body>
<form action="Weibo/rl/regFeed.jsp" method="post">
    <p>
        <label>账号 :</label>
        <input type="text" name="loginID">
    </p>
    <p>
        <label>密码:</label>
        <input type="text" name="loginPWD">
    </p>
    <p>
        <label>确认密码:</label>
        <input type="text" name="loginPWDTwo">
    </p>
    <p>
        <label>电话号码:</label>
        <input type="text" name="phoneNum">
    </p>
    <p>
        <input type="submit" value="登录">
    </p>
</form>
</body>
</html>
