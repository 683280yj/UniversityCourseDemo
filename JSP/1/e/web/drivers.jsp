<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/4
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
    <style type="text/css">
        #goodsListDiv{
            width: 1024px;
            margin: 0px auto;
            overflow: hidden;
        }
        #goodsDiv{
            width: 200px;
            float: left;
            margin: 2px;
            border: 1px solid red;
            text-align: center;
        }
    </style>
</head>

<body>
<div id="goodsListDiv" style="width: 1024px;">
    <c:forEach items="${goodsList}" var = "goods">
        <div id="goodsDiv" style="width: 200px;">
            <img src="img/s2.jpg" style="width: 160px; height: 160px;" /><br />
            <a href="#">${goods.gName}</a><br />
            <span style="color: red;">${goods.price}</span><br />
            <a href="car?gid=${goods.gid}">加入购物车</a>
        </div>
    </c:forEach>
</div>
</body>
</html>
