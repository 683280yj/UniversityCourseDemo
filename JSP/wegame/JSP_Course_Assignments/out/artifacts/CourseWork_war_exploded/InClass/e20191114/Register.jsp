<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/14
  Time: 8:43
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
    <title>Title</title>
</head>
<body>
<form action="e20191114/index.jsp" method="post">
    <p>
        <label>AccountNumber:</label>
        <input type="text" name="loginID">
    </p>
    <p>
        <label>Password:</label>
        <input type="text" name="loginPass">
    </p>
    <p>
        <label>ConfirmPassword:</label>
        <input type="text" name="loginPassT">
    </p>
    <p>
        <label>PhoneNumber:</label>
        <input type="text" name="phoneNum">
    </p>
    <p>
        <input type="submit" value="Register">
    </p>
</form>
</body>
</html>
