<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="show.aspx.cs" Inherits="WebApplication1.show" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <style type="text/css">
        body {
            background: linear-gradient(to right,#47C7AC,#7FD9AD,#C3EFAE,#F1FCB6);
        }
        div{
            color:red;
            padding-top:10%;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div align="center">
            欢迎登录:<asp:Label Font-Size="22px" color="red" id="account" runat="server" Text="用户名"></asp:Label>
        </div>
    </form>
</body>
</html>
