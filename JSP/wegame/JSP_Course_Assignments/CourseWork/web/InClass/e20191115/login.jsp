<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/15
  Time: 9:30
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
    <title>注册</title>
</head>
<body>
<form action="InClass/e20191115/valilogin.jsp" method="post">
    <p>
        <label>账号：</label>
        <input type="text" name="loginID"/>
    </p>
    <p>
        <label>密码：</label>
        <input type="password" name="loginPass"/>
    </p>
    <p>
        <input type="submit" value="登录"/>
    </p>
    <p>
        <a href="InClass/e20191115/Register.jsp">注册</a>
    </p>
    <%
        if (request.getAttribute("err") != null) {
            out.print("<p style='color:red;'>" + request.getAttribute("err") + "</p>");
        }
    %>
</form>
</body>
</html>
