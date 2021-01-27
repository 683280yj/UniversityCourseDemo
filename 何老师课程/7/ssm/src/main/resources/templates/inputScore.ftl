<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body{
            background-color: antiquewhite;
        }
        .main{
            text-align: center;
            background-color: white;
            width: 400px;
            height: auto;
            margin: 10px 10px 10px 10px;
        }
    </style>
    <script>
       function add(){
           //创建p标签
            var p=document.createElement("p");
            //创建输入框
            var input=document.createElement("input");
            //给输入框设置属性
            input.setAttribute("type","text");
            input.setAttribute("name","score");

            var btn=document.createElement("input");
            btn.setAttribute("type","button");
            btn.setAttribute("value","删除");
            btn.onclick=function (){
                all.removeChild(p)
            }
            p.appendChild(input)
            p.appendChild(btn);
            all.appendChild(p)

            p.appendChild(input);
            document.getElementById("all").appendChild(p)
        }
    </script>
</head>
<body>
    <div class="main">
        <p><input type="button" value="添加" onclick="add();"/></p>
        <form action="index" method="get">
            <div id="all">

            </div>
            <p><input type="submit" value="提交"></p>
        </form>
    </div>
</body>
</html>