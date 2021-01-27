<%@ WebHandler Language="C#" Class="Handler" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;

public class Handler : IHttpHandler {
    
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
                cmd.CommandText = "select count(*) from Table_1 where userName=@userName and pwd=@pwd";
                cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
                cmd.Parameters.Add("@pwd", context.Request.Form["pwd"]);
                count = (int)cmd.ExecuteScalar();
                if (count > 0)
                {
                    context.Response.Write("登陆成功");
                }
                else
                {
                    context.Response.Write("登陆失败");
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