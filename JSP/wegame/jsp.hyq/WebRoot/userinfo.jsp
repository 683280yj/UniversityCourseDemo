<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>个人中心</title>
</head>
<body>
<%
    if (request.getParameter("loginID") != null) {
        out.println("欢迎你：" + request.getParameter("loginID"));
    } else {
        out.println("<a href='login.jsp'>登录</a>");
    }
%>
</body>
</html>
