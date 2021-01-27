<%@ WebHandler Language="C#" Class="login" %>

using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

public class login : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
        using (SqlConnection conn = new SqlConnection(connStr)) {

            using (SqlCommand cmd = new SqlCommand())
            {
                int count;
                conn.Open();
                cmd.Connection = conn;
                cmd.CommandText = "select count(*) from UserInfo where 账号=@username and 密码=@pwd";
                cmd.Parameters.Add("@username", context.Request.Form["username"]);
                cmd.Parameters.Add("@pwd", context.Request.Form["pwd"]);
                count = (int)cmd.ExecuteScalar();
                if (count > 0)
                {
                    context.Response.Redirect("success.html");
                    
                }
                else
                {
                    context.Response.Write("<script>alert('用户名或密码错误!')</script>");
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