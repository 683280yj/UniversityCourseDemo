<%@ WebHandler Language="C#" Class="addUserInfo" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;

public class addUserInfo : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;//通过name属性找个配置文件
        using (SqlConnection conn = new SqlConnection(connStr)) { //数据库的打开链接
            using (SqlCommand cmd = new SqlCommand()) {
                conn.Open();  //打开数据库
                cmd.Connection = conn; //数据库与储存对象建立联系
                cmd.CommandText = "insert into Table_1(用户名,密码,邮箱) values(@userName,@pwd,@email)";
                cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
                cmd.Parameters.Add("@pwd", context.Request.Form["pwd"]);
                //cmd.Parameters.Add("@time",DateTime.Now);
                cmd.Parameters.Add("@email", context.Request.Form["email"]);

                if (cmd.ExecuteNonQuery()>0)
                {
                    context.Response.Redirect("Handler.ashx");
                }
                else
                {
                    context.Response.Write("输入内容有误");
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