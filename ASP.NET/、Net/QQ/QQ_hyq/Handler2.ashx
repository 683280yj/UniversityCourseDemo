<%@ WebHandler Language="C#" Class="Handler2" %>

using System;
using System.Data;
using System.Data.SqlClient;
using System.Web;

public class Handler2 : IHttpHandler {
    
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
                cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
                cmd.CommandText = "select count(*) from Table_1 where userName=@userName";
                count = (int)cmd.ExecuteScalar();
                if(count > 0)
                {
                    context.Response.Write("此用户已经被注册啦");
                }
                else
                {
                    cmd.CommandText = "insert into Table_1(userName,pwd) values(@userName,@pwd)";
                    cmd.Parameters.Add("@pwd", context.Request.Form["pwd"]);
                    if (cmd.ExecuteNonQuery() > 0)
                    {
                        context.Response.Redirect("HtmlPage3.html");
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