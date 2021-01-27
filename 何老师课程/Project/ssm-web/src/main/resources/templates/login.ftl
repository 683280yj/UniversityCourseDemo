<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>账号登录</title>
    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/reg.js"></script>
    <script src="js/login.js"></script>
    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<div class="login-box">
    <a href="index"><img src="img/logobig.png"/></a>
</div>
<div class="search">
    <img class="big" src="img/big.jpg">
    <div class="search-box">
        <div class="login" id="login" align="center">
            <p align="center" class="title">账号登录</p><input type="button" value="注册" class="search-btn" onclick="showreg()">
            <form action="login1" method="post" id="form1" align="center">
                <p><input type="text" id="userName" name="userName" required="required" placeholder="请输入账号"></p>
                <p><input type="password" id="userPwd" name="userPwd" required="required" placeholder="请输入密码"></p>
                <br>
                <input type="submit" class="btn-login" value="登录">
            </form>
        </div>
        <div class="reg" id="reg" style="display:none" align="center">
            <p align="center" class="title">账号注册</p><input type="button" value="登录" class="search-btn" onclick="showlogin()">
            <form action="reg" method="post" id="form1">
                <p><input type="text" id="userNick" name="userNick" onblur="checkname();" placeholder="请输入昵称" required="required"></p>
                <label id="nick"></label>
                <p><input type="text" id="userName1" name="userName" onblur="checkuser();" placeholder="请输入用户名" required="required"></p>
                <label id="name"></label>
                <p><input type="password" id="userPwd1" name="userPwd" onblur="checkpwd();" placeholder="请输入密码" required="required"></p>
                <label id="pwd"></label>
                <p><input type="password" id="confirm" name="confirm" onblur="checkconfirm();" placeholder="再次输入密码" required="required"></p>
                <input type="submit" class="btn-login" value="注册账号">
            </form>
        </div>
    </div>
</div>
<p class="error" id="error">${error}</p>
</body>
</html>