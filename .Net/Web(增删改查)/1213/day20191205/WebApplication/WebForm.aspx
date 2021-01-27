<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm.aspx.cs" Inherits="WebApplication.WebForm" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link href="css/tableStyle.css" rel="stylesheet" />
</head>
<body>
    <form id="form1" runat="server">
        <a href="Add.aspx">添加</a>
        
    <div>
        <table>
        <tr>
            <th>编号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>时间</th>
            <th>邮箱</th>
            <th>详情</th>
            <th>删除</th>
            <th>修改</th>
        </tr>
        <%--<%=strHtml %>--%>

            <%foreach (var item in UserList){%>
              <tr>
                  <td><%=item.UserID %></td>
                  <td><%=item.UserName %></td>
                  <td><%=item.UserPass %></td>
                  <td><%=item.RegTime %></td>
                  <td><%=item.Email %></td>
                  <td><a href='UserInf.ashx?编号=<%=item.UserID %>'>详情</a></td>
                  <td><a href='Delete.ashx?编号=<%=item.UserID %>'>删除</a></td>
                  <td><a href='Modify.aspx?编号=<%=item.UserID %>'>修改</a></td>
              </tr>
                  
             <% }%>  

    </table>
    </div>
    </form>
</body>
</html>
