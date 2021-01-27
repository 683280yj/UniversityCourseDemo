using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        public void Login()
        {
            String connString = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
            SqlConnection conn = new SqlConnection(connString);
            conn.Open();
            String sql = "select * from UserInfo where 账号=@useraccount and 密码=@userpassword";
            SqlCommand comm = new SqlCommand(sql, conn);
            comm.Parameters.Add("useraccount", useraccount.Text);
            comm.Parameters.Add("userpassword", userpassword.Text);
            SqlDataReader sqlreader = comm.ExecuteReader();
            if (sqlreader.Read())
            {
                Response.Write("<script language=javascript>alert('登录成功！');window.location = 'show.aspx?useraccount="+useraccount.Text+"&userpassword"+userpassword.Text+"';</script>");
            }
            else
            {
                connotlogin.Text = "账号或密码错误！";
            }
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Login();
        }
    }
}
