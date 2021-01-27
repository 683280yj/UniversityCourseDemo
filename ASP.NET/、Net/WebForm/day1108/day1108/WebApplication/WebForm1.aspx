<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <input type="hidden" name="cmr_hyq" value="1"/>
    <div>
        <table>
            <tr>
                <td>用户名</td>
                <td>
                    <input type="text" name="UserName" /></td>
            </tr>
            <tr>
                <td>密码</td>
                <td>
                    <input type="password" name="UserPass" /></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td>
                    <input type="text" name="Email" /></td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="添加用户" /></td>
            </tr>
        </table>
    </div>
    </form>
</body>
</html>