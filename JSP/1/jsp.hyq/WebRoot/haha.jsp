<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String msg = "";
	String loginID = request.getParameter("loginID");
	if(loginID != null && !loginID.equals("null")){
		msg="欢迎你<a href='#'>"+loginID+"</a>";
	}
	else{
		msg="<a href='login.jsp'>登录</a>";
	}
%>
<%=msg %>