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
        //全选/非全选
        function choose(){
            var box=document.getElementsByName("ids");
            if(box[0].checked){//如果第一个多选框层现选中状态
                for(var i=0;i<box.length;i++){
                    box[i].checked=true;
                }
                document.getElementById("btn").disabled="";
            }else{
                for(var i=0;i<box.length;i++){//如果没有第一个checkbox选中
                    box[i].checked=false;
                }
                document.getElementById("btn").disabled="disabled";
            }
        }
        //监听每一条数据的第一个checkbox
        function choose1(){
            var box=document.getElementsByName("ids");
            var result=false;
            for(var i=1;i<box.length;i++){
                if(box[i].checked==false){//只要有一条数据没有选中那么一定不是全选的状态
                    result=true;
                    break;
                }
            }
            //如果result为true那么肯定不是所有的数据都是空的
            if(result){
                box[0].checked=false;
            }else{
                box[0].checked=true;
            }

            //接下来开始判断删除按钮是否需要开启了
            var temp=false;
            for(var i=1;i<box.length;i++){
                if(box[i].checked){
                    temp=true;
                    break;
                }
            }
            if(temp){
                document.getElementById("btn").disabled="";
            }else{
                document.getElementById("btn").disabled="disabled";
            }
        }

        //删除的方法
        function del(){
            //有取得所有的id的值
            var box=document.getElementsByName("ids");
            var ids="";//容器用来装id的
            for(var i=1;i<box.length;i++){
                if(box[i].checked){
                    ids+=box[i].value+",";
                }
            }
            //询问框，问用户是否需要删除的操作!
            if(confirm('你确定需要删除id是'+ids+'的数据吗?')){
                //alert('执行删除');
                location.href='del?ids='+ids;
            }else{
                alert('您取消了删除的操作!');
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