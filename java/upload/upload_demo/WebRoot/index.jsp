<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	function check(){
    var fileobj=document.getElementById("nfile").files[0];
   	var fileType = fileobj.type;
    var fileName = fileobj.name;
    var fileSize = fileobj.size / 1024;//kb//再除以个1024就是MB
    if((fileSize<=200)&&(fileType=='image/png')){
    return true;
    }else{
    alert('上传文件大小超过了200KB或者数据类型不是图像格式');
    return false;
     }
	}
	</script>
  </head>
  <body>
 <form method="post" enctype="multipart/form-data" action="UserServlet" onsubmit="return check();">
上传文件：<input type="file" name="nfile" id="nfile"><br/>
文件描述：<input type="text" name="explain" id="explain"><br/>
<input type="submit" value="上传"> 
</form>

  </body>
</html>
