// 验证用户名
function checkuser() {
    var user = document.getElementById("username").value.trim();//账号
    var pattern = /^[a-zA-Z][a-zA-Z0-9]{3,16}$/;
    if (pattern.test(user)) {
        document.getElementById("user").innerHTML = '账号√';
        document.getElementById("user").style.color = 'green';
        document.getElementById("user").style.fontSize = '13px';
        document.getElementById("username").style.borderColor = 'green';
        localStorage.setItem('username', user);
    } else {
        document.getElementById("user").innerHTML = '用户名以字母开头由字母和数字组成,位数大于4';
        document.getElementById("user").style.color = 'red';
        document.getElementById("userusername").style.borderColor = 'red';
    }
}
//密码
function checkpwd() {
    var pwd = document.getElementById("pwd").value.trim();
    var pattern = /[a-zA-Z0-9]{4,10}$/;
    if (pattern.test(pwd)) {
        document.getElementById("pwd1").innerHTML = '密码√';
        document.getElementById("pwd1").style.color = 'green';
        document.getElementById("pwd1").style.fontSize = '13px';
        document.getElementById("pwd").style.borderColor = 'green';
        localStorage.setItem('pwd', pwd);
    } else {
        document.getElementById("pwd1").innerHTML = '密码由英文字母和数字组成的4-10位字符';
        document.getElementById("pwd1").style.color = 'red';
        document.getElementById("pwd").style.borderColor = 'red';
    }
}