<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>歌手列表</title>
		<style type="text/css">
			* {
				margin: 0px;
				padding: 0px;
				list-style-type: none;
				font-size: 12px;
			}
		</style>
		<script src="js/jquery-1.11.0.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$(function(){
				$("#sltArea").change(function(){
//					$("#singerListDiv").load(
//						"singerbyarea",
//						{"area", $("#sltArea").val()}
//					);
					$.ajax({
						type: "post",
						url: "singerbyarea",
						dataType: "text",
						data: {
							"area": $("#sltArea").val()
						},
						success:function(data){
							$("#singerListDiv").html(data);
						},
						error: function(xhr, status, errorobj){
							alert(status);
							alert(errorobj);
						}
					});
					
				});
			});
		</script>
  </head>
  
  <body>
    	<select id="sltArea" name="sltArea">
			<option value="-1">全部</option>
			<c:forEach items="${areas }" var="area">
				<option value="${area }">${area }</option>
			</c:forEach>
		</select>
		<div id="singerListDiv">
			
		</div>
  </body>
</html>
