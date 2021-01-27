<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table tr td{
            width: 200px;
            height: 50px;
            border: 1px solid sandybrown;
            background-color: beige;
        }
    </style>
</head>
<body>
    <table>
        <tr class="title">
            <td>编号</td>
            <td>姓名</td>
            <td>生日</td>
            <td>性别</td>
            <td>职业</td>
            <td>住所</td>
            <td>电话</td>
            <td>操作</td>
        </tr>
        <#list list as item>
        <tr>
            <td>${item.profileId}</td>
            <td>${item.profileName}</td>
            <td>${item.profileBirthday}</td>
            <td>${item.profileGender}</td>
            <td>${item.profileCareer}</td>
            <td>${item.profileAddress}</td>
            <td>${item.profileMobile}</td>
            <td class="oper">
                <a href="UserDeta?id=${item.profileId}"><input type="button" value="明细"></a>
                <a href="Userupdate?id=${item.profileId}"><input type="button" value="修改"></a>
            </td>
        </tr>
        </#list>
    </table>
</body>
</html>