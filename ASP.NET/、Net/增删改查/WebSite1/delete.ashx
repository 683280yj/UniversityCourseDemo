<%@ WebHandler Language="C#" Class="delect" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;
public class delect : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;//通过name属性找个配置文件
        int id;
        if (int.TryParse(context.Request.QueryString["id"], out id))  //TryParse 把第一个参数尝试进行转换,如果转换成功返回true，并且把转换的值赋值给第二个参数
        {
            using (SqlConnection conn = new SqlConnection(connStr))//数据库的打开链接
            {
                using (SqlCommand cmd = new SqlCommand()) {
                    conn.Open();  //打开数据库
                    cmd.Connection = conn; //数据库与储存对象建立联系
                    cmd.CommandText = "delete from Table_1 where 编号=@id";
                    cmd.Parameters.Add("@id", id);
                    if (cmd.ExecuteNonQuery()>0)
                    {
                        ///context.Response.Redirect("Handler.ashx");
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