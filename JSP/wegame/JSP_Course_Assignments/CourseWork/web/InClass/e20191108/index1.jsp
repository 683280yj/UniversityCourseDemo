<%@ page import="java.util.Random" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/8
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%!
    public int intNum2() {
        Random random = new Random();
        int intNum = 1000 + random.nextInt(9999);
        return intNum;
    }
%>

<%--<%=intNum2()%>--%>
$END$
</body>
</html>
