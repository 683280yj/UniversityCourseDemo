<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>编号</td>
            <td>${profileId}</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>${profileName}</td>
        </tr>
        <tr>
            <td>生日</td>
            <td>${profileBirthday}</td>
        </tr>
        <tr>
            <td>性别</td>
            <td>${profileGender}</td>
        </tr>
        <tr>
            <td>职业</td>
            <td>${profileCareer}</td>
        </tr>
        <tr>
            <td>住所</td>
            <td>${profileAddress}</td>
        </tr>
        <tr>
            <td>电话</td>
            <td>${profileMobile}</td>
        </tr>
        <tr>
            <td>
                <input type="button" value="返回" onclick="javascript:history.back(-1);">
            </td>
        </tr>
    </table>
</body>
</html>