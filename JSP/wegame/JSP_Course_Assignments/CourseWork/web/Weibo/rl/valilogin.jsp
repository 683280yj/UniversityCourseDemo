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
    if (loginID != null && loginPass != null &&
            loginID.length() > 0 && loginPass.length() > 0) {
        if (UserDao.login(loginID, loginPass) > 0) {
//            request.getRequestDispatcher("InClass/e20191115/userinfo.jsp").forward(request,response);
//            request.getRequestDispatcher("e20191115/userinfo.jsp").forward(request,response);
            request.getRequestDispatcher("userinfo.jsp").forward(request, response);
        } else {
            request.setAttribute("err", "Wrong account or password!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    } else {
        request.setAttribute("err", "请输入账号和密码！");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
%>