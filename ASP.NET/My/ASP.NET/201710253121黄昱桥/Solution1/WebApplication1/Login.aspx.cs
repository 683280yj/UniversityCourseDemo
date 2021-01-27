using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class Login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        public void login1()
        {
            String connString = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
            SqlConnection conn = new SqlConnection(connString);
            conn.Open();
            String sql = "select * from UserInfo where UserName=@useraccount and UserPass=@userpassword";
            SqlCommand comm = new SqlCommand(sql, conn);
            comm.Parameters.Add("useraccount", useraccount.Text);
            comm.Parameters.Add("userpassword", userpassword.Text);
            SqlDataReader sqlreader = comm.ExecuteReader();
            if (sqlreader.Read())
            {
                HttpContext.Current.Session["useraccount"] = useraccount.Text;
                HttpContext.Current.Session["userpassword"] = userpassword.Text;
                Response.Redirect("index.aspx");
            }
            else
            {
                login.Text = "账号或密码错误！";
            }
            conn.Close();
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            login1();
        }
    }
}