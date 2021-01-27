<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/14
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.io.Writer" %>
<%@page import="com.kevin.dao.SingerDao" %>
<%@page import="com.kevin.baseclass.Singer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<%--
    List<Singer> list = SingerDao.selectAll();
    Writer writer = response.getWriter();
    writer.write("<html>");
    writer.write("<head><title>歌手列表</title></head>");
    writer.write("<body>");
    writer.write("<table>");
    writer.write("<tr><th>序号</th><th>名称</th><th>类型</th></tr>");
    for(int i=0; i<list.size(); i++){
        Singer singer = list.get(i);
        writer.write("<tr><th>"+singer.getSingerID()+"</th><th>"+singer.getSingerName()+"</th><th>"+singer.getSingerType()+"</th></tr>");
    }
    writer.write("</table>");
    writer.write("</body>");
    writer.write("</html>");

--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>歌手列表</title>

</head>

<body>
<%
    List<Singer> list = SingerDao.selectAll();
    out.print("<table>");
    out.print("<tr><th>序号</th><th>名称</th><th>类型</th></tr>");
    for (int i = 0; i < list.size(); i++) {
        Singer singer = list.get(i);
        out.print("<tr><th>" + singer.getSingerID() + "</th><th>" + singer.getSingerName() + "</th><th>" + singer.getSingerType() + "</th></tr>");
    }
    out.print("</table>");

    response.getWriter().write("<script>alert('数据请取成功！');</script>");
%>
</body>
</html>
