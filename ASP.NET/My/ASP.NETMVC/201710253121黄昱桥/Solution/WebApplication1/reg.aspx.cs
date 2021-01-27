using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class reg : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        public void Reg()
        {
            string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
            using (SqlConnection conn = new SqlConnection(connStr))
            {
                using (SqlCommand cmd = new SqlCommand())
                {
                    int count;
                    conn.Open();
                    cmd.Connection = conn;
                    cmd.CommandText = "select count(*) from UserInfo where 账号=@useraccount";
                    cmd.Parameters.Add("useraccount", useraccount.Text);
                    count = (int)cmd.ExecuteScalar();
                    if (count > 0)
                    {
                        connotlogin.Text = "账号已注册！";
                    }
                    else
                    {
                        cmd.CommandText = "insert into UserInfo(账号,密码) values(@useraccount,@userpassword)";
                        cmd.Parameters.Add("userpassword", userpassword.Text);
                        if (cmd.ExecuteNonQuery() > 0)
                        {
                            Response.Write("<script language=javascript>alert('注册成功！');window.location = 'login.aspx';</script>");
                        }
                        else
                        {
                            connotlogin.Text = "注册失败！";
                        }
                    }
                }
            }
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Reg();
        }
    }
}