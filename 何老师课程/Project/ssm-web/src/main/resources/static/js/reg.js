// 验证昵称
function checkname(){
    var name=document.getElementById("userNick").value.trim();//昵称
    var pattern=/[\u4e00-\u9fa5]{1,6}$/;
    if(pattern.test(name)){
        document.getElementById("userNick").style.borderColor='green';
        document.getElementById("nick").innerText=' ';
    }else{
        document.getElementById("userNick").style.borderColor='red';
        document.getElementById("nick").innerText='1个以上字母';
    }
}
// 验证用户名
function checkuser(){
    var user=document.getElementById("userName1").value.trim();//账号
    var pattern=/[a-zA-Z][a-zA-Z0-9]{3,16}$/;
    if(pattern.test(user)){
        document.getElementById("userName1").style.borderColor='green';
        document.getElementById("name").innerText=' ';
    }else{
        document.getElementById("userName1").style.borderColor='red';
        document.getElementById("name").innerText='3位以上的字母开头加数字';
    }
}
//密码
function checkpwd(){
    var pwd=document.getElementById("userPwd1").value.trim();
    var pattern=/[a-zA-Z0-9]{4,10}$/;
    if(pattern.test(pwd)){
        document.getElementById("userPwd1").style.borderColor='green';
        document.getElementById("pwd").innerText=' ';
    }else{
        document.getElementById("userPwd1").style.borderColor='red';
        document.getElementById("pwd").innerText='4位以上的字母加数字';
    }
}
//确认密码
function checkconfirm(){
    var confirm=document.getElementById("confirm").value.trim();
    var pattern=document.getElementById("userPwd1").value.trim();
    if(pattern==confirm&&confirm!=''){
        document.getElementById("confirm").style.borderColor='green';
    }else{
        document.getElementById("confirm").style.borderColor='red';
    }
}