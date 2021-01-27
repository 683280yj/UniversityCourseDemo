<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
	String msg = "";
	int age = request.getParameter("age")==null?0:Integer.parseInt(request.getParameter("age"));
	if(age>=18){
		msg="欢迎光临！";
	}
	else{
		msg="小P孩，这不是你该来的地方！";
	}
%>
<%=msg %>