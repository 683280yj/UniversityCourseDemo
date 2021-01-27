using Perject.BLL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using User.Model;

namespace WebApplication
{
    public partial class Modify1 : System.Web.UI.Page
    {
        public UserInfo userinf { set; get; }
        protected void Page_Load(object sender, EventArgs e)
        {
            UserInfoService userInfoService = new UserInfoService();
            int id;
            if(int.TryParse(Request.QueryString[ "编号"],out id)){
                userinf = userInfoService.GetEntity(id);
            }
        }
    }
}