<%@ page import="com.kevin.dao.UserDao" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/15
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String loginID = request.getParameter("loginID");
    String loginPass = request.getParameter("loginPass");
    String loginPassT = request.getParameter("loginPassT");
    String phoneNum = request.getParameter("phoneNum");
    if (loginID != null && loginPass != null &&
            loginID.length() > 0 && loginPass.length() > 0 &&
            loginPass == loginPassT) {
        if (UserDao.register(loginID, loginPass, phoneNum) > 0) {
            request.getRequestDispatcher("userinfo.jsp").forward(request, response);
        } else {
            request.setAttribute("err", "login has failed");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    } else {
        request.setAttribute("err", "请输入账号和密码！");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
%>