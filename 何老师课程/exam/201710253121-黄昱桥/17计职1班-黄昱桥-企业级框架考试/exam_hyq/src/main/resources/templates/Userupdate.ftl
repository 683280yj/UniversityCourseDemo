<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="Userupdate" method="post">
    <table>
        <tr>
            <td>编号</td>
            <td><input type="hidden" id="userId" name="userId" value="${profileId}"></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" value="${profileName}"></td>
        </tr>
        <tr>
            <td>生日</td>
            <td><input type="text" value="${profileBirthday}"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" value="${profileGender}"></td>
        </tr>
        <tr>
            <td>职业</td>
            <td><input type="text" value="${profileCareer}"></td>
        </tr>
        <tr>
            <td>住所</td>
            <td><input type="text" value="${profileAddress}"></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" value="${profileMobile}"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="确定">
                <input type="button" value="返回" onclick="javascript:history.back(-1);">
            </td>
        </tr>
    </table>
</form>
</body>
</html>