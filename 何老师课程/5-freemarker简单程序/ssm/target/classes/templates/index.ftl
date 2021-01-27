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
        function loadData(){
            var size=${list?size};
            for(var i=0;i<size;i++){
                var score=parseInt(document.getElementById("sc"+i).innerHTML);
                if (score>=90){
                    document.getElementById("tr"+i).style.background="#00b4d8";
                }else if (score>=60){
                    document.getElementById("tr"+i).style.background="#ffba08";
                }else{
                    document.getElementById("tr"+i).style.background="#9d0208";
                }
            }
        }
    </script>
</head>
<#--<body onload="loadData()">-->
<body>
<#--    ${username}<br>-->
<#--    ${password}-->
    <table>
        <tr><td>序号</td><td>user_id</td><td>user_name</td><td>user_score</td></tr>
        <#list list as item>
<#--            <tr><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName!'empty'}</td></tr>-->
<#--            <tr><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName?default("empty")}</td></tr>-->
<#--            <tr><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName?cap_first}</td></tr>-->
<#--            判断为空则显示empty否则首字母大写-->
<#--            <#if null = '${item.userName}'>-->
<#--                <tr><td>${item_index+1}</td><td>${item.userId}</td><td>empty</td></tr>-->
<#--            <#else>-->
<#--                <tr><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName?cap_first}</td></tr>-->
<#--            </#if>-->
<#--            根据成绩显示不同颜色-->
<#--            <#if item.userScore gt 90>-->
<#--                <tr style="background-color: aqua"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td></tr>-->
<#--            <#elseif item.userScore gt 70>-->
<#--                <tr style="background-color: beige"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td></tr>-->
<#--            <#else>-->
<#--                <tr style="background-color: red"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td></tr>-->
<#--            </#if>-->
<#--            根据成绩显示不同颜色方法二-->
<#--            <tr id="tr${item_index}"><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td id="sc${item_index}">${item.userScore}</td></tr>-->

            <tr style="background-color: <#if item.userScore gt 90>#00b4d8<#elseif item.userScore gt 60>#ffba08<#else>#9d0208</#if>"><tr><td>${item_index+1}</td><td>${item.userId}</td><td>${item.userName}</td><td>${item.userScore}</td></tr>
        </#list>
    </table>
</body>
</html>