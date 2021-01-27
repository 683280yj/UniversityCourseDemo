using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.IO;
using System.Linq;
using System.Web;

namespace WebApplication
{

    public class UpdateInfo : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
            int id;
            if (int.TryParse(context.Request.Form["hid"], out id))  
            {
                using (SqlConnection conn = new SqlConnection(connStr))
                {
                    using (SqlCommand cmd = new SqlCommand())
                    {
                        conn.Open(); 
                        cmd.Connection = conn; 
                        cmd.CommandText = " update hyq set 用户名=@userName,密码=@pwd,邮箱=@email where 编号=@id";
                        cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
                        cmd.Parameters.Add("@pwd", context.Request.Form["pwd"]);
                        cmd.Parameters.Add("@email", context.Request.Form["email"]);
                        cmd.Parameters.Add("@id", id);
                        if (cmd.ExecuteNonQuery() > 0)
                        {
                            context.Response.Redirect("UserInfoList.ashx");
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

        public bool IsReusable
        {
            get
            {
                return false;
            }
        }
    }
}