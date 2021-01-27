<%@ WebHandler Language="C#" Class="updateInfo" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;
public class updateInfo : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;//通过name属性找个配置文件
        int id;
        if (int.TryParse(context.Request.Form["hid"], out id))  //TryParse 把第一个参数尝试进行转换,如果转换成功返回true，并且把转换的值赋值给第二个参数
        {
            using (SqlConnection conn = new SqlConnection(connStr))//数据库的打开链接
            {
                using (SqlCommand cmd = new SqlCommand())
                {
                    conn.Open();  //打开数据库
                    cmd.Connection = conn; //数据库与储存对象建立联系
                    cmd.CommandText = " update Table_1 set 用户名=@userName,密码=@pwd,邮箱=@email where 编号=@id";
                    cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
                    cmd.Parameters.Add("@pwd", context.Request.Form["pwd"]);
                    cmd.Parameters.Add("@email", context.Request.Form["email"]);
                    cmd.Parameters.Add("@id", id);
                    if (cmd.ExecuteNonQuery() > 0)
                    {
                        context.Response.Redirect("Handler.ashx");
                    }
                    else
                    {
                        context.Response.Redirect("Error.html");
                    }
                }
            }
        }
        else
        {
            context.Response.Write("参数有误");
        }
        
        
    }
 
    public bool IsReusable {
        get {
            return false;
        }
    }

}