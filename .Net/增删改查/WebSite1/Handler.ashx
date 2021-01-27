<%@ WebHandler Language="C#" Class="Handler" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;
using System.Text;
using System.IO;

public class Handler : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;//通过name属性找个配置文件
        using (SqlConnection conn = new SqlConnection(connStr)) {   //数据库的打开链接
            using (SqlDataAdapter apter = new SqlDataAdapter("select * from Table_1", conn)) { //通过sql语句得到数据
                DataTable dt = new DataTable();//创建储存数据的表
                apter.Fill(dt);//将数据放入表中 
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    sb.AppendFormat("<tr><td>{0}</td><td>{1}</td><td>{2}</td><td>{3}</td><td>{4}</td><td><a href='userInfo.ashx?id={5}'>详情</a></td><td><a href='delete.ashx?id={5}' class='del' >删除</a></td><td><a href='update.ashx?id={5}'  >修改</a></td></tr>", dt.Rows[i]["编号"]
                    , dt.Rows[i]["用户名"], dt.Rows[i]["密码"], Convert.ToDateTime(dt.Rows[i]["时间"]).ToShortDateString(), dt.Rows[i]["邮箱"], dt.Rows[i]["编号"]);
                }

                string str = context.Request.MapPath("HtmlPage.html");
                string countStr = File.ReadAllText(str);
                countStr = countStr.Replace("$tdoby", sb.ToString());
                context.Response.Write(countStr);
                
            }
        }
        
    }
 
    public bool IsReusable {
        get {
            return false;
        }
    }

}