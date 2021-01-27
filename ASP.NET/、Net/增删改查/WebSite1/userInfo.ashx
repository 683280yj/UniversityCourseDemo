<%@ WebHandler Language="C#" Class="userInfo" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;
using System.Text;
using System.IO;


public class userInfo : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;//通过name属性找个配置文件
        int id;
        if (int.TryParse(context.Request.QueryString["id"], out id))  //TryParse 把第一个参数尝试进行转换,如果转换成功返回true，并且把转换的值赋值给第二个参数
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
                        string StrPath = context.Request.MapPath("userInfo.html");
                        string countStr = File.ReadAllText(StrPath);
                        countStr = countStr.Replace("$userName", dt.Rows[0]["用户名"].ToString());
                        countStr = countStr.Replace("$pwd", dt.Rows[0]["密码"].ToString());
                        countStr = countStr.Replace("$email", dt.Rows[0]["邮箱"].ToString());
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
 
    public bool IsReusable {
        get {
            return false;
        }
    }

}