using Perject.BLL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using User.Model;

namespace WebApplication
{
    /// <summary>
    /// Update 的摘要说明
    /// </summary>
    public class Update : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            UserInfoService UserInfoService = new UserInfoService();
            int id;
            UserInfo user = new UserInfo();
            if(int.TryParse(context.Request.Form["id"],out id)){
                user.UserName = context.Request.Form["username"];
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
}