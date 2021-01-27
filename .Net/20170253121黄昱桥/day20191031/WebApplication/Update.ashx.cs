using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.IO;
using System.Linq;
using System.Web;

namespace WebApplication
{

    public class Update : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
            int id;
            if (int.TryParse(context.Request.QueryString["id"], out id))
            {
                using (SqlConnection conn = new SqlConnection(connStr))
                {
                    using (SqlDataAdapter apter = new SqlDataAdapter("select * from hyq where 编号=@id", conn))
                    {
                        
                        DataTable dt = new DataTable();
                        apter.Fill(dt);

                        if (dt.Rows.Count > 0)
                        {
                            string StrPath = context.Request.MapPath("update.html");
                            string countStr = File.ReadAllText(StrPath);
                            countStr = countStr.Replace("$userName", dt.Rows[0]["用户名"].ToString());
                            countStr = countStr.Replace("$pwd", dt.Rows[0]["密码"].ToString());
                            countStr = countStr.Replace("$email", dt.Rows[0]["邮箱"].ToString());
                            countStr = countStr.Replace("$hid", id.ToString());
                            context.Response.Write(countStr);
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