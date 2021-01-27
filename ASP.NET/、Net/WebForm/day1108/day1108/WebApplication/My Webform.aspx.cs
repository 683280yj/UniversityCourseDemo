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
    public partial class My_Webform : System.Web.UI.Page
    {
        public List<UserInfo> UserInfoList { set; get; }
        protected void Page_Load(object sender, EventArgs e)
        {
            UserInfoService userInfoService = new UserInfoService();
            List<UserInfo> list = userInfoService.GetEntityList();
            UserInfoList = list;
        }
    }
}