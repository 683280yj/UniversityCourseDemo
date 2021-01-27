<%@ WebHandler Language="C#" Class="reg" %>

using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

public class reg : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
            string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
            using (SqlConnection conn = new SqlConnection(connStr))
            {
                using (SqlCommand cmd = new SqlCommand())
                {
                    int count;
                    conn.Open();
                    cmd.Connection = conn;
                    cmd.Parameters.Add("@username", context.Request.Form["username"]);
                    cmd.CommandText = "select count(*) from UserInfo where 账号=@username";
                    count = (int)cmd.ExecuteScalar();
                    if (count > 0)
                    {
                        context.Response.Write("此用户已经被注册啦");
                        context.Response.Redirect("reg.html");
                    }
                    else
                    {
                        cmd.CommandText = "insert into UserInfo(账号,密码) values(@username,@pwd)";
                        cmd.Parameters.Add("@pwd", context.Request.Form["pwd"]);
                        if (cmd.ExecuteNonQuery() > 0)
                        {
                            context.Response.Redirect("login.html");
                            context.Response.Write("注册成功，请登录");
                        }
                        else
                        {
                            context.Response.Write("注册失败");
                        }
                    }
                }
            }
    }
 
    public bool IsReusable {
        get {
            return false;
        }
    }

}