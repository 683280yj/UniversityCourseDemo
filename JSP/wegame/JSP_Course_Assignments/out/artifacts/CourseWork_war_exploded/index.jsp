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
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<div style="width: 1000px;height: 200px;">
    <p>
        <a href="index2.jsp">In Class</a>
        <a href="Weibo/index.jsp">Homework</a>
    </p>
</div>
<div style="width: 1000px;height: 200px;">
    <jsp:include page="index2.jsp"></jsp:include>
</div>
<div style="width: 1000px;height: 200px;">
    <jsp:include page="Weibo/index.jsp"></jsp:include>
</div>
</body>
</html>
