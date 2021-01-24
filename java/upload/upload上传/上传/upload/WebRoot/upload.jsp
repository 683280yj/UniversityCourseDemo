<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
SmartUpload s=new SmartUpload();
s.initialize(pageContext);
   try{
   	 s.upload();
      }catch(Exception ex){
 	 ex.printStackTrace();
      }
    File file=s.getFiles().getFile(0); 
	String filepath = "upload\\";
   filepath += file.getFileName();
   //文件另存为   
   //out.print("aaa"+SmartUpload.SAVE_VIRTUAL);
   file.saveAs(filepath, SmartUpload.SAVE_VIRTUAL);
	

 %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
  </body>
</html>
