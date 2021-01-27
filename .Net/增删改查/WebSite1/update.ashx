<%@ WebHandler Language="C#" Class="update" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;
using System.IO;
public class update : IHttpHandler
{

    public void ProcessRequest(HttpContext context)
    {
        context.Response.ContentType = "text/html";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;//通过name属性找个配置文件
        int id;
        if (int.TryParse(context.Request.QueryString["id"], out id))
        {
            using (SqlConnection conn = new SqlConnection(connStr))//数据库的打开链接
            {
                using (SqlDataAdapter apter = new SqlDataAdapter("select * from Table_1 where 编号=@id", conn))//通过sql语句得到数据
                {
                    apter.SelectCommand.Parameters.AddWithValue("@id", id);
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
                        context.Response.Write("没有此用户");
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