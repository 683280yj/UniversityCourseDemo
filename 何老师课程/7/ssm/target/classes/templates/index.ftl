<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        body{
            background-color: antiquewhite;
        }
        table tr td{
            text-align: center;
            border: 2px solid white;
            border-bottom: 2px solid cornflowerblue;
        }
    </style>
    <script>
        //全选
        function choose(){
            let box=document.getElementsByName("ids");
            if(box[0].checked){//第一个多选框选中
                for(let i=0;i<box.length;i++){
                    box[i].checked=true;
                }
                document.getElementById("btn").disabled=""
            }else{
                for(let i=0;i<box.length;i++){//第一个多选框未选中
                    box[i].checked=false;
                }
                document.getElementById("btn").disabled="disabled"
            }
        }
        //监听每一个checkbox
        function choose1(){
            let box=document.getElementsByName("ids");
            let result=false;
            for (let i=1;i<box.length;i++){
                if(box[i].checked==false){
                    result=true;
                    break;
                }
            }
            if(result){
                box[0].checked=false;
            }
            else{
                box[0].checked=true;
            }
            let temp=false;
            for (let i=1;i<box.length;i++){
                if (box[i].checked){
                    temp=true;
                    break;
                }
            }

            if (temp){
                document.getElementById("btn").disabled="";
            }else{
                document.getElementById("btn").disabled="disabled";
            }
        }

        function del(){
            //取得所有id的值
            let box=document.getElementsByName("ids");
            var ids="";
            for (let i=1;i<box.length;i++){
                if(box[i].checked){
                    ids+=box[i].value+",";
                }
            }
            if(confirm("你确定要删除"+ids+"吗")){
                alert("数据已删除");
            }else{
                alert("取消删除");
            }
        }
    </script>
</head>
<body>
    <table>
        <#if list?? && (list?size > 0)>
        <tr><td><input type="checkbox" name="ids" onclick="choose();">全选/非全选</td><td>序号</td><td>user_id</td><td>user_name</td><td>user_score</td><td>user_sex</td></tr>
        <#list list as item>
            <tr><td><input type="checkbox" name="ids" onclick="choose1();" value="${item.userId}"></td><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td><td>${item.userSex}</td></tr>
        </#list>
        <tr><td><input type="button" value="删除" id="btn" disabled="disabled" onclick="del();"></td></tr>
        <#else>
            暂无数据
        </#if>
        <tr><td><a href="addUser">增加</a></td></tr>
    </table>
</body>
</html>