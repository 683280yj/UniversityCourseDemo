<%@ page import="page.UserDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String loginID = request.getParameter("loginID");
    String loginPWD = request.getParameter("loginPWD");
    if (loginID != null && loginPWD != null &&
            loginID.length() > 0 && loginPWD.length() > 0) {
        if (UserDao.login(loginID, loginPWD) > 0) {
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