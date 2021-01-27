<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Modify.aspx.cs" Inherits="WebApplication.Modify1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <p>用户名<input type="text" value=" <%=userinf.UserName %>" name="UserName" /></p>
            <p>密码<input type="password" value=" <%=userinf.UserPass %>" name="UserPass" /></p>
            <p>邮箱<input type="text" value=" <%=userinf.Email %>" name="Email" /></p>
            <input type="hidden" name="txtid" value="111"/>
            <input type="hidden" name="<%=userinf.UserID%>" value="222"/>
            <input type="submit" value="修改"/>
        </div>
    </form>
</body>
</html>
