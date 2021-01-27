<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body{
            background-color: lightsteelblue;
        }
        table tr td{
            width: 180px;
            height: 40px;
        }
        #box-hover td:hover{
            background-color: aquamarine;
            color: slategrey;
            font-size: 21px;
        }
        input,.box1{
            color: black;
        }
        .box1{
            background-color:steelblue;
        }
        table{
            border: 2px solid slategrey;
            text-align: center;
        }
        tr{
            border: 2px solid steelblue;
        }
        .title-box{
            background-color: slategrey;
        }
        .main-box{
                margin: 180px 0 0 0;
        }
        table{
            margin: 50px 0 0 0;
        }
    </style>
    <script>
        //全选/非全选
        function choose() {
            var box = document.getElementsByName("ids");
            if (box[0].checked) {//如果第一个多选框层现选中状态
                for (var i = 0; i < box.length; i++) {
                    box[i].checked = true;
                }
                document.getElementById("btn").disabled = "";
            } else {
                for (var i = 0; i < box.length; i++) {//如果没有第一个checkbox选中
                    box[i].checked = false;
                }
                document.getElementById("btn").disabled = "disabled";
            }
        }

        //监听每一条数据的第一个checkbox
        function choose1() {
            var box = document.getElementsByName("ids");
            var result = false;
            for (var i = 1; i < box.length; i++) {
                if (box[i].checked == false) {//只要有一条数据没有选中那么一定不是全选的状态
                    result = true;
                    break;
                }
            }
            //如果result为true那么肯定不是所有的数据都是空的
            if (result) {
                box[0].checked = false;
            } else {
                box[0].checked = true;
            }

            //接下来开始判断删除按钮是否需要开启了
            var temp = false;
            for (var i = 1; i < box.length; i++) {
                if (box[i].checked) {
                    temp = true;
                    break;
                }
            }
            if (temp) {
                document.getElementById("btn").disabled = "";
            } else {
                document.getElementById("btn").disabled = "disabled";
            }
        }

        //删除的方法
        function del() {
            //有取得所有的id的值
            var box = document.getElementsByName("ids");
            var ids = "";//容器用来装id的
            for (var i = 1; i < box.length; i++) {
                if (box[i].checked) {
                    ids += box[i].value + ",";
                }
            }
            //询问框，问用户是否需要删除的操作!
            if (confirm('你确定需要删除id是' + ids + '的数据吗?')) {
                //alert('执行删除');
                location.href = 'del?ids=' + ids;
            } else {
                alert('您取消了删除的操作!');
            }
        }
        function pageData(pageIndex){
            document.getElementById("pageIndex").value=pageIndex;
            document.getElementById("pageSize").value=2;
            document.getElementById("form1").submit();
            // alert(pageIndex);
        }
    </script>
</head>
<body>
<div class="main-box" align="center">
<#--    <img src="../img/pho.jpg">-->
<div class="search">addUser.ftl
    <form action="index" method="get" id="form1">
        <input type="hidden" name="pageIndex" id="pageIndex" value="${pageIndex}">
        <input type="hidden" name="pageSize" id="pageSize" value="${pageSize}">
        姓名:<input type="text" name="userName" value="${userName}">
        成绩:<input type="text" name="userScore" value="${userScore}">
        性别:<input type="text" name="userSex" value="${userSex}">
        <input type="submit" value="查询">
    </form>
</div>
<table align="center">
    <#if list?? && (list?size > 0)>
        <tr class="title-box">
            <td><input type="checkbox" name="ids" onclick="choose();"></td>
            <td>序号</td>
            <td>用户ID</td>
            <td>用户名字</td>
            <td>用户成绩</td>
            <td>用户性别</td>
            <td>操作</td>
        </tr>
        <#list list as item>
            <tr class="box1" id="box-hover">
                <td><input type="checkbox" name="ids" onclick="choose1();" value="${item.userId}"></td>
                <td>${item_index+1}</td>
                <td>${item.userId}</td>
                <td>${item.userName}</td>
                <td>${item.userScore}</td>
                <td>${item.userSex}</td>
                <td>
                    <a href="updataUserA?userId=${item.userId}">
                        <input type="button" value="修改" id="upinput">
                    </a>
                </td>
            </tr>
        </#list>
        <tr class="box1">
            <td colspan="7"><input type="button" value="删除" id="btn" disabled="disabled" onclick="del();"></td>
        </tr>
    <#else>
        暂无数据
    </#if>
    <tr class="box1">
        <td colspan="7"><a href="addUser"><input type="submit" value="增加"></a></td>
    </tr>
    <tr class="box1">
        <#if pageIndex!=null>
            <td colspan="7">当前页:${pageIndex}每页最大条数：${pageSize}总页：${totalPage}</td>
        </#if>
    </tr>
    <#if pageIndex!=null>
    <tr class="box1">
        <#if pageIndex!=1>
            <td colspan="3">
                <a href="javascript:pageData(${pageIndex-1});">上一页</a>
            </td>
        </#if><td></td>
        <#if pageIndex!=totalPage>
            <td colspan="3">
                <a href="javascript:pageData(${pageIndex+1});">下一页</a>
            </td>
        </#if>
        </#if>
    </tr>
</table>
</div>
</body>
</html>