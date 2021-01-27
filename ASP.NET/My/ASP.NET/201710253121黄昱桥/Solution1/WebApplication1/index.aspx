<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="index.aspx.cs" Inherits="WebApplication1.index" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <style type="text/css">
        body {
            background: linear-gradient(to right,#47C7AC,#7FD9AD,#C3EFAE,#F1FCB6);
        }
        table tr td{
            border:double 1px;
            text-align:center;
        }
        td{
            width:200px;
            height:100px;
        }
        form{
            padding-top:70px;
        }
        #title{
            height:50px;
        }
        
    </style>
</head>
<body>
    <form id="form1" action="upload.ashx" runat="server">
        <table align="center">
        <tr>
            <td>用户名</td>
            <td style="color:blue"><asp:Label id="account" runat="server" Text=""></asp:Label></td>
        </tr>
        <tr>
            <td>密码</td>
            <td style="color:blue"><asp:Label id="password" runat="server" Text=""></asp:Label></td>
        </tr>
        <tr>
            <td colspan="2">
                请选择上传的图片 <input type="file" name="fileUp" id="fileUp"/>
                <input type="submit" value="上传图片" />
            </td>
        </tr>
    </table>
    </form>
</body>
</html>
