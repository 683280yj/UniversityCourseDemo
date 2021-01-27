<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="reg.aspx.cs" Inherits="WebApplication1.reg" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <script src="reg.js"></script>
    <style type="text/css">
        body {
            background: linear-gradient(to right,#47C7AC,#7FD9AD,#C3EFAE,#F1FCB6);
        }
        #form1{
            padding-top:10%;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server" align="center">
        <h1>注册</h1>
        <asp:Label ID="Label1" runat="server" Text="用户名：" ></asp:Label>
        <asp:TextBox ID="useraccount" runat="server"></asp:TextBox><br />
        <asp:Label ID="Label2" runat="server" Text="密    码：" ></asp:Label>
        <asp:TextBox ID="userpassword" runat="server" TextMode="Password"></asp:TextBox><br />
        <asp:Button ID="Button1" runat="server" Text="注册" onclick="Button1_Click" /><br />
        <a href="login.aspx">登录</a>
    </form>
    <asp:Label Font-Size="22px" color="red" id="connotlogin" runat="server"></asp:Label>
</body>
</html>
