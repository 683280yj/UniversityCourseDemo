<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
    
    <title>My JSP 'singer.jsp' starting page</title>
    
	
  </head>
  
  <body>
    <%
    	List<Singer> list = SingerDao.selectAll();
    	out.print("<table>");
    	out.print("<tr><th>序号</th><th>名称</th><th>类型</th></tr>");
    	for(int i=0; i<list.size(); i++){
    		Singer singer = list.get(i);
    		out.print("<tr><th>"+singer.getSingerID()+"</th><th>"+singer.getSingerName()+"</th><th>"+singer.getSingerType()+"</th></tr>");
    	}
    	out.print("</table>");
    	
    	response.getWriter().write("<script>alert('数据请取成功！');</script>");
    %>
  </body>
</html>
