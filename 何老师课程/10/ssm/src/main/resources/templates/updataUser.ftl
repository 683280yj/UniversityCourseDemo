<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>

    </style>
</head>
<body>
<p>修改</p>
<form action="updataUser" method="post">
    <input type="hidden" id="userId" name="userId" value="${userId}">
    <p>用户名:<input type="text" name="userName" value="${userName}"></p>
    <p>用户分数:<input type="text" name="userScore" value="${userScore}"></p>
    <p>用户性别:<input type="text" name="userSex" value="${userSex}"></p>
    <p><input type="submit"></p>
</form>
</body>
</html>