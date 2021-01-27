using Perject.BLL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using User.Model;

namespace WebApplication
{
    /// <summary>
    /// Modify 的摘要说明
    /// </summary>
    public class Modify : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            UserInfoService userInfoService = new UserInfoService();
            int id;
            UserInfo user = new UserInfo();
            if(int.TryParse(context.Request.Form["id"],out id)){
                user.UserName = context.Request.Form["username"];
                user.UserPass = context.Request.Form["userpass"];
                user.Email = context.Request.Form["email"];
                user.UserID = id;
                int i = userInfoService.UpdateUserInfo(user);
                if (i > 0)
                {
                    context.Response.Redirect("WebForm.aspx");
                }
                else {
                    context.Response.Write("失败！！！");
                }
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