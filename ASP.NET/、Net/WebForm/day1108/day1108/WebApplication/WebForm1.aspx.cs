using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using User.Model;

namespace WebApplication
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            //if (IsPostBack)
            
            if (!string.IsNullOrEmpty(Request.Form["isPostBack"]))
            {
                UserInfo userInfo = new UserInfo();

            }
        }
    }
}