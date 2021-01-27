<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/14
  Time: 8:42
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
    <title>HomePage</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String loginID = request.getParameter("loginID");
    String loginPWD = request.getParameter("loginPWD");
    String loginPWDTwo = request.getParameter("loginPWDTwo");
    String phoneNum = request.getParameter("phoneNum");

%>
AccountNumber:<%=loginID%><br />
Password:<%=loginPWD%><br />
ConfirmPassword:<%=loginPWDTwo%><br />
PhoneNumber:<%=phoneNum%><br />
</body>
</html>
